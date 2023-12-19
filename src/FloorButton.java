public class FloorButton extends Button {

    void callElevator(Floor floor) {
        switch (floor.getFloorId()) {


            case 1:
                System.out.println("Elevator has been coming to go " + floor + "'st floor.");
                break;
            case 2:
                System.out.println("Elevator has been coming to go " + floor + "'nd floor.");
                break;
            case 3:
                System.out.println("Elevator has been coming to go " + floor + "'rd floor.");
                break;
            default:
                System.out.println("Elevator has been coming to go " + floor + "'th floor.");
        }
    }
}

