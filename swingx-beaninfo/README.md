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
  JXButtonBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget
  JXComboBoxBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget
  JXTextFieldBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget
  JXFormattedTextFieldBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget
  JXColorSelectionButtonBeanInfoTest>AbstractBeanInfoTest.testBoundProperties:90 » InvocationTarget

WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)


Tests run: 101, Failures: 18, Errors: 7, Skipped: 31


   - Runtime: TODO