package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {

    private int level = 1;
    private String name = "key";

    /**
     * Creates a default key with level 1 and name "key".
     */
    public Key() {
        this.level = 1;
        this.name = "key";
    }

    /**
     * Creates a key with specified level and default name "key".
     * @param level - the key's level
     */
    public Key(int level) {
        this.level = level;
        this.name = "key";
    }

    /**
     * Creates a key with specified level and name.
     * @param level - the key's level
     * @param name - the key's name
     */
    public Key(int level, String name) {
        this.level = level;
        this.name = name;
    }

    /**
     * Gets the level of the key.
     * @return the key's level
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Gets the name of the key.
     * @return the key's name
     */
    @Override
    public String getName() {
        return this.name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
