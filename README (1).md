


# EI_CODING_ASSESSMENT (MONIKA M - 21C055)

# Exercise1

## *Behavioural pattern*

## Observer Pattern

***ObserverPatternDemo.java:***  Implement a weather monitoring system where multiple displays (observers) can register to receive updates from a weather station whenever the weather data changes.

![image]

## Mediator Pattern

***MediatorPatternDemo.java:*** Implement a chat room where users can send messages to each other through a mediator.

![image]

## *Creational pattern*

## Prototype Pattern

***PrototypePatternDemo.java:*** Implement a system where shapes can be cloned to create new shapes without creating a new instance from scratch. 

![image]

## Factory pattern

***FactoryMethodPatternDemo.java:*** Create a system that produces different types of documents (PDF, Word, Excel) using a factory method.

![image]

## *Structural pattern*

## Facade Pattern

***FacadePatternDemo.java:*** Implement a home theater system where a single facade class provides a simplified interface to control multiple subsystems like DVD player, projector, and sound system.

![image]

## Decorator pattern

***DecoratorPatternDemo.java:*** Decorate a basic coffee with additional features (milk, sugar, etc.) using decorators.

![image]

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








