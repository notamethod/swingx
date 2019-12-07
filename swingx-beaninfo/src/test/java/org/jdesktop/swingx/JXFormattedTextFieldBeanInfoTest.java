package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXFormattedTextFieldBeanInfoTest extends AbstractBeanInfoTest<JXFormattedTextField> {
    @Override
    protected JXFormattedTextField createInstance() {
        return new JXFormattedTextField();
    }

    @Test
    @Override
    @Ignore("JDK11: ClassCastException between mockito object and Integer, see readme")
    public void testBoundProperties() throws Exception { super.testBoundProperties(); }
}
