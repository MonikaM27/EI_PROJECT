# EI_CODING_ASSESSMENT (MONIKA M - 21C055)

# Exercise1

## *Behavioural pattern*

## Observer Pattern

***ObserverPatternDemo.java:***  Implement a weather monitoring system where multiple displays (observers) can register to receive updates from a weather station whenever the weather data changes.

![image](https://github.com/user-attachments/assets/cb65f1c7-5dff-4d29-b948-0bee208c8781)

## Mediator Pattern

***MediatorPatternDemo.java:*** Implement a chat room where users can send messages to each other through a mediator.

![image](https://github.com/user-attachments/assets/3e23bcac-a860-405c-af74-13ec2a5837d4)

## *Creational pattern*

## Prototype Pattern

***PrototypePatternDemo.java:*** Implement a system where shapes can be cloned to create new shapes without creating a new instance from scratch. 

![image](https://github.com/user-attachments/assets/d67dc638-6894-4321-9da4-2fc049b689b3)

## Factory pattern

***FactoryMethodPatternDemo.java:*** Create a system that produces different types of documents (PDF, Word, Excel) using a factory method.

![image](https://github.com/user-attachments/assets/add6db1a-074f-4eca-ac73-ca3923b83c52)

## *Structural pattern*

## Facade Pattern

***FacadePatternDemo.java:*** Implement a home theater system where a single facade class provides a simplified interface to control multiple subsystems like DVD player, projector, and sound system.

![image](https://github.com/user-attachments/assets/cf493548-d4e0-4da0-ade0-a61d8240e1c2)

## Decorator pattern

***DecoratorPatternDemo.java:*** Decorate a basic coffee with additional features (milk, sugar, etc.) using decorators.

![image](https://github.com/user-attachments/assets/56dfb04a-add3-4d9e-bfe1-ad85b0bc74f1)

# Exercise2

# Mars Rover Simulation

A Java-based simulation application that models the movement of a Mars Rover on a grid. The application accepts commands to control the rover's movements and ensures it stays within the grid boundaries.


## Features

Sets the initial position and direction of the rover on the grid.

Moves the rover forward or backward based on its current direction.

Changes the rover's direction to the left or right.

Ensures the rover does not move outside the predefined grid.


## Design Patterns Used

*Singleton Pattern:* Ensures only one instance of the MarsRoverController.

*Factory Pattern:* Provides a factory method for creating Command objects.

*Observer Pattern:* Notifies observers about the rover's position changes.

*Command Pattern:* Encapsulates commands for moving and turning the rover.

## Classes

*MarsRoverSimulation:* Main class that runs the simulation and handles user input.

*MarsRover:* Represents the rover with attributes such as position and direction.

*Grid:* Defines the grid boundaries and checks for boundary conditions.

*Command:* Interface for commands.

*MoveCommand:* Command for moving the rover.

*TurnCommand:* Command for turning the rover.

*CommandFactory:* Provides a way to create Command objects.

*Observer:* Defines the observer interface.

*RoverPositionObserver:* Concrete observer class for handling rover position notifications.

## Usage

*Initialize Rover:* Set the initial position and direction.

*Execute Commands:* Move and turn the rover using commands.

*Check Position:* Ensure the rover stays within the grid boundaries.

![image](https://github.com/user-attachments/assets/aecbe7dc-e3fb-4635-8072-f9df8e928918)

![image](https://github.com/user-attachments/assets/22d31111-67e8-4e40-9e62-5470d6f1805f)
