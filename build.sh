echo "Compiling TS"
pushd ts
yarn build
popd
echo "Compiling Java"
pushd executor
./build.sh
popd
echo "Done!"
echo
#java -jar executor/dist/Executor.jar
