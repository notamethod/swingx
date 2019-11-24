Migration Status
- JDK8:
  - Compilation warnings: corrected
  - Unit tests: OK
  - jar generation: OK
  - Runtime: TODO
  
- JDK11:
  - Compilation warnings: 
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/ShadowRenderer.java:[269,42] Integer(int) in java.lang.Integer has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/ShadowRenderer.java:[270,42] Integer(int) in java.lang.Integer has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/Graphics2DFacade.java:[442,17] finalize() in java.awt.Graphics has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/Graphics2DFacade.java:[443,17] finalize() in java.awt.Graphics has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/Graphics2DFacade.java:[452,22] getClipRect() in java.awt.Graphics has been deprecated
  [WARNING] /home/buck/git/swingxcr/swingx-graphics/src/main/java/org/jdesktop/swingx/graphics/Graphics2DFacade.java:[453,24] getClipRect() in java.awt.Graphics has been deprecated

  - Unit tests: OK
  
  WARNING: An illegal reflective access operation has occurred
  WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
  WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
  WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
  WARNING: All illegal access operations will be denied in a future release

  - jar generation: OK
  - Runtime: TODO
  
