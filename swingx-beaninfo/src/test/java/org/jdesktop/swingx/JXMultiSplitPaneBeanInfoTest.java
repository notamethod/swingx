package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXMultiSplitPaneBeanInfoTest extends AbstractBeanInfoTest<JXMultiSplitPane> {
    @Override
    protected JXMultiSplitPane createInstance() {
        return new JXMultiSplitPane();
    }

    @Test
    @Override
    @Ignore("JDK11: bound read-only property: accessibleContext")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }
}
