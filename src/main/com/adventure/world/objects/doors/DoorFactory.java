package main.com.adventure.world.objects.doors;

public class DoorFactory {

    /**
     * Creates a door based on the given params.
     * @param isOpen - the door's open state
     * @param level - the door's level
     * @return a door
     */
    public static Door buildDoor(boolean isOpen, int level) {
        Door door = new Door(isOpen, level);
        return door;
    }
}
