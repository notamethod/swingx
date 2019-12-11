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
package org.jdesktop.swingx.autocomplete;

/**
 * <p>
 * This class is used to provide string representations for objects when
 * doing automatic completion.
 * </p><p>
 * A class inherited from this class could be used, when the object's
 * <code>toString</code> method is not appropriate for automatic completion.
 * </p><p>
 * An example for i18n:
 * </p>
 * <code>
 * public class I18NStringConverter extends ObjectToStringConverter {
 *   ResourceBundle bundle;
 *
 *   public I18NStringConverter(ResourceBundle bundle) {
 *     this.bundle = bundle;
 *   }
 *
 *   public String getPreferredStringForItem(Object item) {
 *     return item==null ? null : bundle.getString(item.toString());
 *   }
 * }
 * </code>
 * <p>
 * It's also possible to return more than one string representation. The
 * following example shows a converter that will allow a user to choose an
 * airport using either the airport's full description (<code>toString()</code>) or
 * its ICAO/IATA code:
 * </p>
 * <pre>{@code
 * public class AirportConverter extends ObjectToStringConverter {
 *
 *   public String[] getPossibleStringsForItem(Object item) {
 *     if (item==null) return new String[0];
 *     if (!(item instanceof Airport)) throw new IllegalArgumentException();
 *     Airport airport = (Airport) item;
 *     return new String[]{airport.toString(), airport.icaoCode, airport.iataCode};
 *   }
 *
 *   public String getPreferredStringForItem(Object item) {
 *     return item==null?null:getPossibleStringsForItem(item)[0];
 *   }
 * }
 * }</pre>
 * @author Thomas Bierhance
 */
public abstract class ObjectToStringConverter {
    
    /**
     * Returns all possible <code>String</code> representations for a given item.
     * The default implementation wraps the method <code>getPreferredStringForItem</code>.
     * It returns an empty array, if the wrapped method returns <code>null</code>. Otherwise
     * it returns a one dimensional array containing the wrapped method's return value.
     *
     * @param item the item to convert
     * @return possible <code>String</code> representation for the given item.
     */
    public String[] getPossibleStringsForItem(Object item) {
        String preferred = getPreferredStringForItem(item);
        return preferred == null ? new String[0] : new String[] { preferred };
    }
    
    /**
     * Returns the preferred <code>String</code> representations for a given item.
     * @param item the item to convert
     * @return the preferred <code>String</code> representation for the given item.
     */
    public abstract String getPreferredStringForItem(Object item);
    
    /**
     * This field contains the default implementation, that returns <code>item.toString()</code>
     * for any item <code>!=null</code>. For any item <code>==null</code>, it returns <code>null</code> as well.
     */
    public static final ObjectToStringConverter DEFAULT_IMPLEMENTATION = new DefaultObjectToStringConverter();
    
    private static class DefaultObjectToStringConverter extends ObjectToStringConverter {
        @Override
        public String getPreferredStringForItem(Object item) {
            return item==null ? null : item.toString();
        }
    }    
}
