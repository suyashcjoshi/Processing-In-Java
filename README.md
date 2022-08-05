# Processing-In-Java

Running a processing sketch in Java SE using Maven. Maven will download the dependencies incluiding the processing version 4.x core.jar file that is needed to build and run Processing Sketch within Java.

## Pre-Requisitesd

1. Java SDK version 11+ (recommened Java SDK 17)
2. Maven build tool

## How to run this app
```
git clone <this repository>
cd <repository>
mvn clean package
mvn exec:java
```

## App.Java

The processing sketch lives inside of App.java class that you can modify just like a normal processing sketch. The only thing to keep in mind is the main method that has the line `PApplet.main("dev.suyashjoshi.creativecode.App");` which points to the fully qualified class name of the project so make sure to update that if you change it for your own project.
