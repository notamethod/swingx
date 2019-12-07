package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXTextFieldBeanInfoTest extends AbstractBeanInfoTest<JXTextField> {
    @Override
    protected JXTextField createInstance() {
        return new JXTextField();
    }

    @Test
    @Override
    @Ignore("JDK11: ClassCastException between mockito object and Integer, see readme")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }

}
