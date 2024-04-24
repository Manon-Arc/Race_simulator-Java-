# Java Racing Simulator

*Project by __ARCAS__ Manon*

Welcome to the Java Racing Simulator project ! <br>
This project aims to provide a simulation environment for races between different vehicles. <br>
This README will guide you through setting up your environment, compiling the project, and starting the simulator.

## 📌 Table of Contents:

I. [Badges](#🎯-badges)    
III. [Prerequisites](#🔧-prerequisites)  
IV. [Starting the Simulator](#💻-starting-the-simulator)  
V. [Project Overview](#🌟-project-overview)  

## 🎯 Badges

[![Java logo](https://img.shields.io/badge/Language-Java-red
)](https://www.java.com/fr/)


## 🔧 Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/fr/java/technologies/downloads/) installed on your system.


### Setup Instructions

1. **Clone the Repository (Optional)**
   ```bash
   https://github.com/Manon-Arc/Race_simulator_Java.git

   cd Race_simulator_Java
   ```

## 💻 Starting the Project

### 1. Edit the main function in the Engine.java file

```bash
#Instanciate new pilot and viewer
    Kart pilotX = new Kart("kartPilot");
    Motorbike pilotY = new Motorbike("motorPilot");
    Truck pilotZ = new Truck("truckPilot");

    Viewer viewer1 = new Viewer("John", 15, new Bet("Rachid", 5) );

#Instanciate new race + add pilo/viewer in the course
    Race race = new Race(2,4);

    race.AddVehicle(pilotX);
    race.AddViewer(viewerX);

#Start the race
    System.out.println(race.StartRace());

#Print some data...
    System.out.println(pilotX.toString());
    System.out.println(viewerX.getMoney());
    ...
```

### 2. Start the program
```bash
javac *.java -d build

java -cp build Engine
```
