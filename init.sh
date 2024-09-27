#! /usr/bin/sh

javac -d bin -cp "lib/*" src/**/*.java
java -cp "bin:lib/*" main.Main