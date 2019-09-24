Echo "Cleaning old dist"
rm -rf dist
mkdir dist
echo "Compiling"
javac -d dist src/com/graalts/executor/Executor.java
pushd dist
echo "Packaging into jar"
jar cvfe Executor.jar com.graalts.executor.Executor com/graalts/executor/Executor.class ../src/resources
popd
