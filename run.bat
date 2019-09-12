@echo off
java -jar generator-0.0.1.jar
mvn mybatis-generator:generate > out.log