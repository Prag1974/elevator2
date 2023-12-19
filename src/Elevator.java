import java.util.TimerTask;

public class Elevator {
    Door door;
    Floor floor;

    public int[] buttonList;

    public Elevator(int currentFloor){
        int i = 0;
        floor.setFloorId(currentFloor);
        for (ButtonEnum bEnum : ButtonEnum.values()){
            buttonList[i] = bEnum.toFloor();

            i++;
        }

    }

    void goToFloor(int floorId) {
        door.open();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
        door.close();
    };

}
