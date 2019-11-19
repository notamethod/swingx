Migration Status
- JDK8:
  - Compilation warnings: 
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXList.java:[1031,21] getSelectedValues() in javax.swing.JList has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicXListUI.java:[3119,39] getSelectedValues() in javax.swing.JList has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicTransferable.java:[147,28] java.io.StringBufferInputStream in java.io has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicTransferable.java:[158,28] java.io.StringBufferInputStream in java.io has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[185,13] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[494,26] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXList.java: Some input files use unchecked or unsafe operations.
[WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXList.java: Recompile with -Xlint:unchecked for details.

  - Unit tests: 
Tests run: 2030, Failures: 4, Errors: 4, Skipped: 4
Results :

Failed tests: 
  PromptTextAreaUITest>PromptTextUITest_Base.testGetBaseLine:43 expected same:<-2> was not:<12>
  PromptTextFieldUITest>PromptTextUITest_Base.testGetBaseLine:43 expected same:<-2> was not:<-1>
   Expected exception: java.text.ParseException
   Expected exception: java.text.ParseException

Tests in error: 
  TreeModelSupportTest.testPathChangedNotNullPathElements:76 » IllegalArgument L...
  TreeModelSupportTest.testTreeStructureChangedNotNullPathElements:128 » IllegalArgument
  JXMonthViewTest.testLastDisplayedDateSizeChangedEnsureVisible:1621 » InvocationTarget
  JXFrameTest.testGraphicsConfig:35 » ClassCast org.jdesktop.swingx.JXFrameTest$...

Tests run: 2030, Failures: 4, Errors: 4, Skipped: 4

  
  - jar generation: 
  - Runtime: TODO