#!/bin/sh

jdeps -R  ../swingx-core/target/swingx-core-*.jar > ../swingx-core/jdeps.txt
jdeps -R  ../swingx-action/target/swingx-action-*.jar > ../swingx-action/jdeps.txt
jdeps -R  ../swingx-autocomplete/target/swingx-*.jar > ../swingx-autocomplete/jdeps.txt
jdeps -R  ../swingx-beaninfo/target/swingx*.jar > ../swingx-beaninfo/jdeps.txt
jdeps -R  ../swingx-common/target/swingx*.jar > ../swingx-common/jdeps.txt
jdeps -R  ../swingx-demos/target/swingx*.jar > ../swingx-demos/jdeps.txt
jdeps -R  ../swingx-graphics/target/swingx*.jar > ../swingx-graphics/jdeps.txt
jdeps -R  ../swingx-mavensupport/target/swingx*.jar > ../swingx-mavensupport/jdeps.txt
jdeps -R  ../swingx-painters/target/swingx*.jar > ../swingx-painters/jdeps.txt
jdeps -R  ../swingx-plaf/target/swingx*.jar > ../swingx-plaf/jdeps.txt
jdeps -R  ../swingx-testsupport/target/swingx*.jar > ../swingx-testsupport/jdeps.txt
jdeps -R  ../swingx-unused/target/swingx*.jar > ../swingx-unused/jdeps.txt