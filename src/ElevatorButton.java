public class ElevatorButton extends Button{

    void go(Floor floor){
        switch (floor.getFloorId()){
            case 1:
        System.out.println("Elevator is moving to " + floor + "'st floor.");
                break;
            case 2:
                System.out.println("Elevator is moving to " + floor + "'nd floor.");
                break;
            case 3:
                System.out.println("Elevator is moving to " + floor + "'rd floor.");
                break;
            default:
                System.out.println("Elevator is moving to " + floor + "'th floor.");


        }

    };
}
