public class Main {
    public static void main(String[] args) {
        var elevator = new Elevator(0);
        elevator.goToFloor(elevator.buttonList[ButtonEnum.FIRST.toFloor()]);

    }
}
