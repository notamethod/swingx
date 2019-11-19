package org.jdesktop.swingx;

import org.jdesktop.beans.AbstractBeanInfoTest;
import org.junit.Ignore;
import org.junit.Test;

public class JXTaskPaneBeanInfoTest extends AbstractBeanInfoTest<JXTaskPane> {
    @Override
    protected JXTaskPane createInstance() {
        return new JXTaskPane();
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
    @Ignore("JDK 8: java.lang.IllegalArgumentException: argument type mismatch")
    public  void testBoundProperties() throws Exception {
        super.testBoundProperties();
    }
}
