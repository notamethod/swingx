package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXRadioGroupBeanInfoTest extends AbstractBeanInfoTest<JXRadioGroup> {
    @Override
    protected JXRadioGroup createInstance() {
        return new JXRadioGroup();
    }

    @Test
    @Override
    @Ignore("JDK11: bound read-only property: actionListeners")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }
}
