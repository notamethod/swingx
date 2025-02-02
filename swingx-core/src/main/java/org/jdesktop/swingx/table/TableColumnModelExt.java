/*
 * $Id$
 *
 * Copyright 2004 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.jdesktop.swingx.table;

import java.util.List;

import javax.swing.event.TableColumnModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.event.TableColumnModelExtListener;

/**
 * An extension of {@code TableColumnModel} suitable for use with
 * {@code JXTable}. It extends the notion of columns considered as part
 * of the view realm to include invisible columns. Conceptually, there are
 * several sets of "columns":
 * 
 * <ol>
 * <li> model columns: all columns of a {@code TableModel}. They are but
 * a virtual concept, characterizable f.i. by (model) column index, (model)
 * column name.
 * <li> view columns: all {@code TableColumnExt} objects added to the
 * {@code TableColumnModelExt}, each typically created and configured in
 * relation to a model column. These can be regarded as a kind of subset of the
 * model columns (not literally, obviously). Each view column belongs to exactly
 * one of the following (real) subsets:
 * <ul>
 * <li> visible columns: all view columns with the visibility property enabled
 * <li> hidden columns: all view columns with the visibility property disabled
 * </ul>
 * </ol>
 * 
 * This class manages the view columns and automatically takes care of keeping
 * track of their location in the visible/hidden subset, triggering the
 * corresponding changes in interested views. Typically, a view column's 
 * visibility can be toggled by user interaction, f.i. via a {@code ColumnControlButton}.
 * <p>
 * An example to programmatically hide
 * the first visible column in the column model:
 * 
 * <pre>{@code
 * TableColumnExt columnExt = columnModel.getColumnExt(0);
 * if (columnExt != null) {
 *     columnExt.setVisible(false);
 * }
 * }</pre>
 * 
 * Note that it is principally allowed to add standard {@code TableColumn}s.
 * Practically, it doesn't make much sense to do so - they will always be
 * visible.
 * <p>
 * 
 * While individual visible columns can be requested by both column identifier
 * and column index, the latter is not available for hidden columns. An example
 * to programmatically guarantee that the view column which corresponds to the
 * first column in the associated {@code TableModel}.
 * 
 * <pre>{@code
 * List<TableColumn> columns = colModel.getColumns(true);
 * for (TableColumn column : columns) {
 *     if (column.getModelIndex() == 0) {
 *         if (column instanceof TableColumnExt) {
 *             ((TableColumnExt) column).setVisible(false);
 *         }
 *         return;
 *     }
 * }
 * }</pre>
 * 
 * Alternatively, the column could be requested directly by identifier. By
 * default the column's headerValue is returned as identifier, if none is set.
 * 
 * <pre>{@code
 * Object identifier = tableModel.getColumnName(0);
 * TableColumnExt columnExt = columnModel.getColumnExt(identifier);
 * if (columnExt != null) {
 *     columnExt.setVisible(false);
 * }
 * }</pre>
 * 
 * Relying on default identifiers is inherently brittle ({@code headerValue}s might
 * change f.i. with {@code Locale}s), so explicit configuration of columns with
 * identifiers is strongly recommended. A custom {@code ColumnFactory}
 * helps to automate column configuration.
 * <p>
 * 
 * 
 * This class guarantees to notify registered
 * {@code TableColumnModelListener}s of type
 * {@code TableColumnModelExtListener} about propertyChanges fired by
 * contained {@code TableColumn}s.
 * An example of a client which adjusts itself based on
 * {@code headerValue} property of visible columns:
 * <pre>{@code
 * TableColumnModelExtListener l = new TableColumnModelExtListener() {
 *
 *     public void columnPropertyChange(PropertyChangeEvent event) {
 *         if ("headerValue".equals(event.getPropertyName())) {
 *             TableColumn column = (TableColumn) event.getSource();
 *             if ((column instanceof TableColumnExt)
 *                     && !((TableColumnExt) column).isVisible()) {
 *                 return;
 *             }
 *             resizeAndRepaint();
 *         }
 *     }
 *
 *     public void columnAdded(TableColumnModelEvent e) {
 *     }
 *
 *     public void columnMarginChanged(ChangeEvent e) {
 *     }
 *
 *     public void columnMoved(TableColumnModelEvent e) {
 *     }
 *
 *     public void columnRemoved(TableColumnModelEvent e) {
 *     }
 *
 *     public void columnSelectionChanged(ListSelectionEvent e) {
 *     }
 *
 * };
 * columnModel.addColumnModelListener(l);
 * }</pre>
 * 
 * 
 * @author Richard Bair
 * @author Jeanette Winzenburg
 * 
 * @see DefaultTableColumnModelExt
 * @see TableColumnExt
 * @see TableColumnModelExtListener
 * @see ColumnControlButton
 * @see JXTable#setColumnControlVisible
 * @see ColumnFactory
 * 
 */
public interface TableColumnModelExt extends TableColumnModel {
    
    /**
     * Returns the number of contained columns. The count includes or excludes invisible
     * columns, depending on whether the {@code includeHidden} is true or
     * false, respectively. If false, this method returns the same count as
     * {@code getColumnCount()}.
     * 
     * @param includeHidden a boolean to indicate whether invisible columns
     *        should be included
     * @return the number of contained columns, including or excluding the
     *         invisible as specified.
     */
    public int getColumnCount(boolean includeHidden);

    /**
     * Returns a {@code List} of contained <code>TableColumn</code>s.
     * Includes or excludes invisible columns, depending on whether the
     * {@code includeHidden} is true or false, respectively. If false, an
     * {@code Iterator} over the List is equivalent to the
     * {@code Enumeration} returned by <code>getColumns()</code>.
     * <p>
     * 
     * NOTE: the order of columns in the List depends on whether or not the
     * invisible columns are included, in the former case it's the insertion
     * order in the latter it's the current order of the visible columns.
     * 
     * @param includeHidden a boolean to indicate whether invisible columns
     *        should be included
     * @return a {@code List} of contained columns.
     */
    public List<TableColumn> getColumns(boolean includeHidden);

    /**
     * Returns the first {@code TableColumnExt} with the given
     * {@code identifier}. The return value is null if there is no contained
     * column with <b>identifier</b> or if the column with {@code identifier} is not
     * of type {@code TableColumnExt}. The returned column
     * may be visible or hidden.
     * 
     * @param identifier the object used as column identifier
     * @return first {@code TableColumnExt} with the given identifier or
     *         null if none is found
     */
    public TableColumnExt getColumnExt(Object identifier);

    /**
     * Returns the {@code TableColumnExt} at view position
     * {@code columnIndex}. The return value is null, if the
     * column at position {@code columnIndex} is not of type
     * {@code TableColumnExt}.
     * The returned column is visible.
     * 
     * @param columnIndex the index of the column desired
     * @return the {@code TableColumnExt} object that matches the column
     *         index
     * @throws ArrayIndexOutOfBoundsException if columnIndex out of allowed
     *         range, that is if
     *         {@code (columnIndex < 0) || (columnIndex >= getColumnCount())}.
     */
    public TableColumnExt getColumnExt(int columnIndex);
    
    /**
     * Adds a listener for table column model events. This enhances super's 
     * behaviour in that it guarantees to notify listeners of type 
     * TableColumnModelListenerExt about property changes of contained columns.
     *  
     * @param x  a {@code TableColumnModelListener} object
     */
    @Override
    public void addColumnModelListener(TableColumnModelListener x);

    
}
