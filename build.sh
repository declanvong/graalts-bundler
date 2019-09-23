echo "Compiling TS"
tsc -p ./ts
echo "Compiling Java"
javac -d ./dist ./executor/Executor.java
echo "Running"
cd dist && java Executor
