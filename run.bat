@echo off
java -jar generator-0.0.2.jar
mvn mybatis-generator:generate > out.log