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
  
- JDK11:

neod to compile with:
<configuration>
          <target>11</target>
          <source>11</source>
          instead of
          <release>11</release>
       because of addexports
       
  - Compilation warnings: 
  
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXList.java:[1031,21] getSelectedValues() in javax.swing.JList has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXSearchField.java:[190,95] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[425,16] viewToModel(javax.swing.text.JTextComponent,java.awt.Point,javax.swing.text.Position.Bias[]) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[430,16] viewToModel(javax.swing.text.JTextComponent,java.awt.Point) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[328,22] modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.Position.Bias) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[342,22] modelToView(javax.swing.text.JTextComponent,int) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[331,49] modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.Position.Bias) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[333,28] modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.Position.Bias) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[409,19] getToolTipText(javax.swing.text.JTextComponent,java.awt.Point) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[410,24] getToolTipText(javax.swing.text.JTextComponent,java.awt.Point) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[426,24] viewToModel(javax.swing.text.JTextComponent,java.awt.Point,javax.swing.text.Position.Bias[]) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/PromptTextUI.java:[431,24] viewToModel(javax.swing.text.JTextComponent,java.awt.Point) in javax.swing.plaf.TextUI has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTable.java:[4260,46] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[879,33] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[889,19] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[890,26] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[890,55] BUTTON1_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[892,39] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[899,52] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[603,34] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[736,50] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[985,25] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[994,19] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[995,26] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[995,55] BUTTON1_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1044,45] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1052,48] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1126,19] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1127,26] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1127,55] BUTTON1_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1172,45] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[1180,56] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTree.java:[1580,43] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXTreeTable.java:[2777,28] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/SwingXUtilities.java:[151,58] ALT_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/SwingXUtilities.java:[153,57] ALT_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/ForwardingRepaintManager.java:[71,17] addDirtyRegion(java.applet.Applet,int,int,int,int) in javax.swing.RepaintManager has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/ForwardingRepaintManager.java:[71,32] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/ForwardingRepaintManager.java:[71,32] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/ForwardingRepaintManager.java:[71,32] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/ForwardingRepaintManager.java:[72,17] addDirtyRegion(java.applet.Applet,int,int,int,int) in javax.swing.RepaintManager has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXApplet.java:[41,31] javax.swing.JApplet in javax.swing has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXApplet.java:[41,31] javax.swing.JApplet in javax.swing has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXApplet.java:[41,31] javax.swing.JApplet in javax.swing has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/hyperlink/LinkModelAction.java:[129,35] Boolean(boolean) in java.lang.Boolean has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicXListUI.java:[3119,39] getSelectedValues() in javax.swing.JList has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicTransferable.java:[147,28] java.io.StringBufferInputStream in java.io has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/core/BasicTransferable.java:[158,28] java.io.StringBufferInputStream in java.io has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLabel.java:[575,52] java.applet.Applet in java.applet has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[427,28] Integer(int) in java.lang.Integer has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[427,59] Integer(int) in java.lang.Integer has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[450,33] Boolean(boolean) in java.lang.Boolean has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[450,69] Boolean(boolean) in java.lang.Boolean has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[470,31] Boolean(boolean) in java.lang.Boolean has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/MultiSplitLayout.java:[470,65] Boolean(boolean) in java.lang.Boolean has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/rollover/TreeRolloverProducer.java:[68,17] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[145,24] Integer(int) in java.lang.Integer has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[148,24] Long(long) in java.lang.Long has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[151,24] Float(float) in java.lang.Float has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[154,24] Double(double) in java.lang.Double has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[157,24] Byte(byte) in java.lang.Byte has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/text/StrictNumberFormatter.java:[160,24] Short(short) in java.lang.Short has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[185,13] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[185,13] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[185,13] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/JXLoginPane.java:[494,26] org.jdesktop.swingx.JXImagePanel in org.jdesktop.swingx has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/event/KeyBindingDispatcher.java:[131,18] getModifiers() in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/BasicMonthViewUI.java:[421,73] SHIFT_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/BasicMonthViewUI.java:[422,74] SHIFT_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/BasicMonthViewUI.java:[423,71] SHIFT_MASK in java.awt.event.InputEvent has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-core/src/main/java/org/jdesktop/swingx/plaf/basic/BasicMonthViewUI.java:[424,73] SHIFT_MASK in java.awt.event.InputEvent has been deprecated

 - tests:
 
 Failed tests: 
   BasicMonthViewUITest.testWeekNumbersWrapBack:127->assertWeekNumbers:167 sanity - weekOfYear expected:<52> but was:<1>
   BasicMonthViewUITest.testWeekNumbersFull6:179->assertWeekNumbers:167 sanity - weekOfYear expected:<13> but was:<14>
   BasicMonthViewUITest.testWeekNumbersMinimum4:189->assertWeekNumbers:167 sanity - weekOfYear expected:<5> but was:<6>
   BuddyLayoutAndBorderTest.testPreferredWidth:54 expected same:<5> was not:<4>
   CalendarUtilsTest.testStartOfWeekBeforeFirstWeekOfMonth:280 expected:<0> but was:<1>
   CalendarUtilsTest.testStartOfWeekBeforeFirstWeekOfYear:293 expected:<0> but was:<1>
 
 Tests in error: 
   FindTest.testEditorResetStateOnNullPattern:111 » ClassCast class java.util.reg...
   FindTest.testEditor:141 Runtime Error finding resource for JXEditorPane
   FindTest.testEditorResetStateOnEmptySearchString:68 » ClassCast class java.uti...
   FindTest.testEditorResetStateOnNullSearchString:90 » ClassCast class java.util...
   PromptTextAreaUITest>PromptTextUITest_Base.testGetBaseLine:40 » ExceptionInInitializer
   PromptTextFieldUITest>PromptTextUITest_Base.testGetBaseLine:40 » ExceptionInInitializer
   BasicMonthViewUITest.testMonthGridPositionAtLocation:1237 NullPointer
   FindTest.testEditorBoundarySearchIndex:686 » ClassCast class java.util.regex.M...
   FindTest.testEditorFindMatchPosition:705 » ClassCast class java.util.regex.Mat...
   FindTest.testEditorFindMatch:720 » ClassCast class java.util.regex.Matcher$Imm...
   FindTest.testEditorBackwards:586 » ClassCast class java.util.regex.Matcher$Imm...
   FindTest.testEditorIncremental:602 » ClassCast class java.util.regex.Matcher$I...
   FindTest.testEditorIncrementalNotFound:619 » ClassCast class java.util.regex.M...
   FindTest.testEditorFindNext:641 » ClassCast class java.util.regex.Matcher$Immu...
   JXTitledPanelTest.testBorderOnLFChange:81 » ExceptionInInitializer
   JXTitledPanelTest.testLayoutOnLFChange:93 » NoClassDefFound Could not initiali...
   JXTitledPanelTest.testTitleNotifyPropertyValue:113 » NoClassDefFound Could not...
   JXTitledPanelTest.testOpaque:69 » NoClassDefFound Could not initialize class o...
   JXPanelTest.testGetEffectiveAlphaWithoutInherit:248 » ExceptionInInitializer
   JXPanelTest.testGetEffectiveAlphaWithInheritGetsSmallestAlpha:255 » NoClassDefFound

 