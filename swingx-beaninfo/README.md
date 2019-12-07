Migration Status
- JDK8:
  - Compilation warnings: Warning on ImagePicker (generated code)
  - Unit tests: 1 failure --> ignored
  - Runtime: TODO
  
 - JDK11:
   - Compilation warnings: OK
   - Unit tests: KO
Tests in error: 
  JXTitledPanelBeanInfoTest>AbstractBeanInfoTest.setUp:45->createInstance:7->createInstance:10 » ExceptionInInitializer
  JXTitledPanelBeanInfoTest>AbstractBeanInfoTest.tearDown:168 » NullPointer
  JXButtonBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget*   -> Ignored
  JXComboBoxBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget*  -> Ignored
  JXTextFieldBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget*  -> Ignored
  JXFormattedTextFieldBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget*  -> Ignored
  JXColorSelectionButtonBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget*  -> Ignored

(*) Error is
java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jdesktop.beans.AbstractBeanInfoTest.testBoundProperties(AbstractBeanInfoTest.java:91)
Caused by: java.lang.ClassCastException: class org.mockito.codegen.Object$MockitoMock$1123014445 cannot be cast to class java.lang.String (org.mockito.codegen.Object$MockitoMock$1123014445 is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')
	at java.desktop/javax.swing.AbstractAction.setToolTipTextFromAction(AbstractAction.java:115)
	at java.desktop/javax.swing.JComboBox.configurePropertiesFromAction(JComboBox.java:1135)
	at java.desktop/javax.swing.JComboBox.setAction(JComboBox.java:1081)

Failures: 18
	
Warnings:
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)


Tests run: 101, Failures: 18, Errors: 7, Skipped: 31


   - Runtime: TODO