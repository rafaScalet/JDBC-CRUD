#! /usr/bin/sh

docker-compose up -d

javac -d bin -cp "lib/*" src/**/*.java
java -cp "bin:lib/*" main.Main
jar cfm jdbc-crud.jar manifest.mf -C bin .

docker-compose down