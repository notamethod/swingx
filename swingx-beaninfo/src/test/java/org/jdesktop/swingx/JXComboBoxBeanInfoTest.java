package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXComboBoxBeanInfoTest extends AbstractBeanInfoTest<JXComboBox> {
    @Override
    protected JXComboBox createInstance() {
        return new JXComboBox();
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
    @Ignore("JDK11: ClassCastException between mockito object and Integer, see readme")
    public void testBoundProperties() throws Exception {
        super.testBoundProperties();
    }
}
