public class Try {
    private int x;
    private int y;
    private int direction; // 0: north, 1: east, 2: south, 3: west

    public Try() {
        this.x = 0;
        this.y = 0;
        this.direction = 0;
    }

    public void executeInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                    turnLeft();
            } else if (instruction == 'R') {
                turnRight();
            } else if (instruction == 'F') {
                moveForward();
            }
        }
    }

    private void turnLeft() {
        direction = (direction + 3) % 4; // rotate 90 degrees left
    }

    private void turnRight() {
        direction = (direction + 1) % 4; // rotate 90 degrees right
    }

    private void moveForward() {
        switch (direction) {
            case 0: // facing north
                y++;
                break;
            case 1: // facing east
                x++;
                break;
            case 2: // facing south
                y--;
                break;
            case 3: // facing west
                x--;
                break;
        }
    }

    public int[] getFinalPosition() {
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Try robot = new Try();
        String instructions = "FFFFFLF";
        robot.executeInstructions(instructions);
        int[] finalPosition = robot.getFinalPosition();
        System.out.println("Final position: [" + finalPosition[0] + ", " + finalPosition[1] + "]");
    }

}
