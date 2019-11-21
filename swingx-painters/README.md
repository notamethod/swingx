Migration Status
- JDK8:
  - Compilation warnings: CompoundPainter.java uses unchecked or unsafe operations
  - Unit tests: N/A
  - jar generation: OK
  - Runtime: TODO
  
- JDK11:
  - Compilation warnings: 
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[288,64] Integer(int) in java.lang.Integer has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[288,92] Integer(int) in java.lang.Integer has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[311,65] Integer(int) in java.lang.Integer has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[311,94] Integer(int) in java.lang.Integer has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[334,71] Boolean(boolean) in java.lang.Boolean has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[334,106] Boolean(boolean) in java.lang.Boolean has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[380,69] Boolean(boolean) in java.lang.Boolean has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[380,102] Boolean(boolean) in java.lang.Boolean has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[403,65] Boolean(boolean) in java.lang.Boolean has been deprecated
[WARNING] /home/buck/git/swingxcr/swingx-painters/src/main/java/org/jdesktop/swingx/painter/effects/AbstractAreaEffect.java:[403,94] Boolean(boolean) in java.lang.Boolean has been deprecated

  - Unit tests: OK, with warnings
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.342 sec
 Running org.jdesktop.swingx.painter.MattePainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.306 sec
 Running org.jdesktop.swingx.painter.GlossPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.311 sec
 Running org.jdesktop.swingx.painter.ImagePainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.325 sec
 Running org.jdesktop.swingx.painter.AbstractLayoutPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.297 sec
 Running org.jdesktop.swingx.painter.effects.AllEffectTest
 Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.091 sec
 Running org.jdesktop.swingx.painter.RectanglePainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.312 sec
 Running org.jdesktop.swingx.painter.CheckerboardPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.319 sec
 Running org.jdesktop.swingx.painter.PinstripePainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.318 sec
 Running org.jdesktop.swingx.painter.BusyPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.316 sec
 Running org.jdesktop.swingx.painter.AbstractAreaPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
 Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.303 sec
 Running org.jdesktop.swingx.painter.CompoundPainterTest
 WARNING: An illegal reflective access operation has occurred
 WARNING: Illegal reflective access by org.mockito.cglib.core.ReflectUtils$2 (file:/home/buck/.m2/repository/org/mockito/mockito-core/1.9.0/mockito-core-1.9.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
 WARNING: Please consider reporting this to the maintainers of org.mockito.cglib.core.ReflectUtils$2
 WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
 WARNING: All illegal access operations will be denied in a future release
  - jar generation: OK
  - Runtime: TODO

  