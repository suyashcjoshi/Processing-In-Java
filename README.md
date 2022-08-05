# Processing-In-Java

Running a processing sketch using Java SE as Maven QuickStart project. Maven downloads, builds and executes the the project and runs the processing sketch using processing version 4.x core.jar library.

## Pre-Requisites

1. JDK version 11+ (recommened JDK 17)
2. Maven build tool
3. Processing `core.jar` downloaded with help of maven when you run the following commands

## Steps to run this project
```
git clone <this repository>
cd <repository>
mvn clean package
mvn exec:java
```

## Understanding & Update `App.Java` class

The processing sketch lives inside of App.java class that you can modify just like a normal processing sketch. The only thing to keep in mind is the main method that has the line `PApplet.main("dev.suyashjoshi.creativecode.App");` which points to the fully qualified class name of the project so make sure to update that if you change it for your own project.

Feel free to make change to the processing helper methods and after saving run `mvn clean package exec:java` to see the changes in effect.

![Processing Sketch Screenshot](https://raw.githubusercontent.com/suyashjoshi/Processing-In-Java/main/screenshot.png)

### Share and Like

If you found this project helpfu,  please consider giving it a star and feel free to follow me for more such tutotials. 
