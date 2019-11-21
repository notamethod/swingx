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

Tests run: 101, Failures: 18, Errors: 7, Skipped: 31


   - Runtime: TODO