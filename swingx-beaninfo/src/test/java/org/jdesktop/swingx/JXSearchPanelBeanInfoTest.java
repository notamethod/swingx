package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXSearchPanelBeanInfoTest extends AbstractBeanInfoTest<JXSearchPanel> {
    @Override
    protected JXSearchPanel createInstance() {
        return new JXSearchPanel();
    }
    
    /**
     * {@inheritDoc}
     */
    @Test
    @Override
    @Ignore("serialization fails")
    public void testSerialization() {
        super.testSerialization();
    }

    @Test
    @Override
    @Ignore("JDK11: Wanted but not invoked: propertyChangeListener.propertyChange")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }
}
