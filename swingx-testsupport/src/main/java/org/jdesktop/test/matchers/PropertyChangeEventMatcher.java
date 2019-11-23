package org.jdesktop.test.matchers;

import static org.hamcrest.CoreMatchers.is;

import java.beans.PropertyChangeEvent;

import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;

@SuppressWarnings("nls")
class PropertyChangeEventMatcher implements ArgumentMatcher<PropertyChangeEvent> {
    private final String propertyName;
    private final Object oldValue;
    private final Object newValue;
    
    public PropertyChangeEventMatcher(String propertyName, Object oldValue, Object newValue) {
        this.propertyName = propertyName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    @Override
    public String toString() {
        return " "+ propertyName;
    }

    @Override
    public boolean matches(PropertyChangeEvent argument) {
        PropertyChangeEvent pce = argument;

        boolean result = propertyName.equals(pce.getPropertyName());
        result &= oldValue == null || pce.getOldValue() == null || is(oldValue).matches(pce.getOldValue());
        result &= newValue == null || pce.getNewValue() == null || is(newValue).matches(pce.getNewValue());

        return result;
    }
}
