public class Player {
    private String fullName;
    private Position position;
    private int number;

    public Player(String fullName, Position position, int number) {
        this.fullName = fullName;
        this.position = position;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  number + " - " + fullName + " - " + position;
    }

    
}
