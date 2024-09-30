#! /usr/bin/sh

javac -d bin -cp "lib/*" src/**/*.java
# jar cfm jdbc-crud.jar MANIFEST.MF -C bin .
java -jar jdbc-crud.jar