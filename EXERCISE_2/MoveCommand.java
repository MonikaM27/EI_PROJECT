public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        Position position = rover.getPosition();
        Direction direction = rover.getDirection();

        Position newPosition = new Position(position.getX(), position.getY());

        switch (direction) {
            case N: newPosition.setY(position.getY() + 1); break;
            case E: newPosition.setX(position.getX() + 1); break;
            case S: newPosition.setY(position.getY() - 1); break;
            case W: newPosition.setX(position.getX() - 1); break;
        }

        if (rover.getGrid().isValidPosition(newPosition)) {
            rover.setPosition(newPosition);
        }
    }
}


