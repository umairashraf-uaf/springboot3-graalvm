Install GraalVM 25 https://www.graalvm.org/downloads/ locally and set the paths:

  export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-jdk-25+37.1/Contents/Home
  export PATH=/Library/Java/JavaVirtualMachines/graalvm-jdk-25+37.1/Contents/Home/bin:$PATH

For local compilation run 
  ./gradlew nativeCompile 
and to start the application:
  ./build/native/nativeCompile/springboot-graalvm

Graal VM Native Installer comes integrated with the native installer package. 

**To build a native Docker Image:**
Run the docker daemon and run the command:
  ./gradlew bootBuildImage --imageName=my-spring-native -Pnative

Alternatively use the docker file.
