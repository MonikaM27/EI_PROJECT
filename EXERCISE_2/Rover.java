public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;
    private CommandExecutor commandExecutor;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.position = new Position(x, y);
        this.direction = direction;
        this.grid = grid;
        this.commandExecutor = new CommandExecutor();
    }

    public void executeCommand(Command command) {
        commandExecutor.execute(command, this);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Grid getGrid() {
        return grid;
    }
}


