## graalts-bundler

A bundler that takes a Typescript project and packages it into a jar file.

Goals:
 - Strong interop between JVM-based languages and Typescript.
   - Call into Java libraries from your Typescript program
   - Let other Java programs execute your classes and methods
 - Performance?
 - Be able to write Typescript as backend code in existing Java systems


TODO:
 - [x] Compile a single TS file (hello world) into a runnable JAR
 - [x] Support multiple TS modules via webpack
 - [ ] Expose Jar interface for other programs to consume our code
 - [ ] Add wiring to execute TS code when called from the external interface
 - [ ] Generate TS declarations from an input jar
 - [ ] Add Maven support and automatically generate all matching ambient declarations
 - [ ] Add wiring to execute external JVM code from generated declarations
