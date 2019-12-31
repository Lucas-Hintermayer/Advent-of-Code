package day3;

public class Path {
    private String direction;
   private int length;

    public Path(String direction, int length) {
        this.direction = direction;
        this.length = length;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
