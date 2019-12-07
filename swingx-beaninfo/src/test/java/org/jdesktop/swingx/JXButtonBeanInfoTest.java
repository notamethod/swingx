package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXButtonBeanInfoTest extends AbstractBeanInfoTest<JXButton> {
    @Override
    protected JXButton createInstance() {
        return new JXButton();
    }

    @Test
    @Override
    @Ignore("JDK11: ClassCastException between mockito object and Integer, see readme")
    public void testBoundProperties() throws Exception {
        super.testBoundProperties();
    }
}
