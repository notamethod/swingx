#!/bin/sh

jdeps -R  ../swingx-core/target/swingx-core-*.jar > ../swingx-core/jdeps-jdk11.txt
jdeps -R  ../swingx-action/target/swingx-action-*.jar > ../swingx-action/jdeps-jdk11.txt
jdeps -R  ../swingx-autocomplete/target/swingx-*.jar > ../swingx-autocomplete/jdeps-jdk11.txt
jdeps -R  ../swingx-beaninfo/target/swingx*.jar > ../swingx-beaninfo/jdeps-jdk11.txt
jdeps -R  ../swingx-common/target/swingx*.jar > ../swingx-common/jdeps-jdk11.txt
jdeps -R  ../swingx-demos/target/swingx*.jar > ../swingx-demos/jdeps-jdk11.txt
jdeps -R  ../swingx-graphics/target/swingx*.jar > ../swingx-graphics/jdeps-jdk11.txt
jdeps -R  ../swingx-mavensupport/target/swingx*.jar > ../swingx-mavensupport/jdeps-jdk11.txt
jdeps -R  ../swingx-painters/target/swingx*.jar > ../swingx-painters/jdeps-jdk11.txt
jdeps -R  ../swingx-plaf/target/swingx*.jar > ../swingx-plaf/jdeps-jdk11.txt
jdeps -R  ../swingx-testsupport/target/swingx*.jar > ../swingx-testsupport/jdeps-jdk11.txt
jdeps -R  ../swingx-unused/target/swingx*.jar > ../swingx-unused/jdeps-jdk11.txt