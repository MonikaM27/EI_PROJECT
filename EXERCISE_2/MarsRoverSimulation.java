import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter grid width:");
        int width = scanner.nextInt();
        System.out.println("Enter grid height:");
        int height = scanner.nextInt();

        
        System.out.println("Enter number of obstacles:");
        int numObstacles = scanner.nextInt();
        Set<Position> obstacles = new HashSet<>();
        for (int i = 0; i < numObstacles; i++) {
            System.out.println("Enter obstacle position (x y):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            obstacles.add(new Position(x, y));
        }

        Grid grid = new Grid(width, height, obstacles);

        
        System.out.println("Enter starting x position:");
        int startX = scanner.nextInt();
        System.out.println("Enter starting y position:");
        int startY = scanner.nextInt();
        System.out.println("Enter starting direction (N, E, S, W):");
        String directionString = scanner.next().toUpperCase();
        Direction startDirection = Direction.valueOf(directionString);

        Rover rover = new Rover(startX, startY, startDirection, grid);

        System.out.println("Enter commands (M for move, L for turn left, R for turn right, end with any non-command character):");
        scanner.nextLine(); 
        String commands = scanner.nextLine().toUpperCase();

        for (char commandChar : commands.toCharArray()) {
            Command command = null;
            switch (commandChar) {
                case 'M': command = new MoveCommand(); break;
                case 'L': command = new TurnLeftCommand(); break;
                case 'R': command = new TurnRightCommand(); break;
                default: continue;
            }
            rover.executeCommand(command);
        }

        Position finalPosition = rover.getPosition();
        Direction finalDirection = rover.getDirection();

        System.out.println("Final Position: (" + finalPosition.getX() + ", " + finalPosition.getY() + ", " + finalDirection + ")");
        System.out.println("Rover is at (" + finalPosition.getX() + ", " + finalPosition.getY() + ") facing " + finalDirection + ".");
        
        scanner.close();
    }
}


