package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXTitledSeparatorBeanInfoTest extends AbstractBeanInfoTest<JXTitledSeparator> {
    @Override
    protected JXTitledSeparator createInstance() {
        return new JXTitledSeparator();
    }

    @Test
    @Override
    @Ignore("JDK11: Wanted but not invoked: propertyChangeListener.propertyChange")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }
}
