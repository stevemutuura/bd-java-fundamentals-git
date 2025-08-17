package main.com.adventure.settings;

import java.util.Objects;

public class Command {

    private String verbString;
    private CommandVerb verb;
    private String objectName;

    /**
     * Creates a command.
     * @param verb - the verb of the command
     * @param objectName - the object(s) to which the command is directed.
     */
    public Command(String verb, String objectName) {
        this.verbString = verb;
        this.verb = CommandVerb.getVerb(verb);
        this.objectName = objectName;
    }

    /**
     * Creates a command with no direct object (e.g. "help").
     * @param verb - the verb of the command
     */
    public Command(String verb) {
        this.verbString = verb;
        this.verb = CommandVerb.getVerb(verb);
        this.objectName = "";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Returns the CommandVerb enum value for tests that expect enum values.
     * @return the CommandVerb enum value
     */
    public CommandVerb getVerb() {
        return this.verb;
    }

    /**
     * Returns the original string verb for tests that expect strings.
     * @return the original verb string
     */
    public String getVerbString() {
        return this.verbString;
    }

    /**
     * Sets the verb and updates the CommandVerb enum accordingly.
     * @param verb - the new verb string
     */
    public void setVerb(String verb) {
        this.verbString = verb;
        this.verb = CommandVerb.getVerb(verb);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Command other = (Command) obj;
        return Objects.equals(this.verbString, other.verbString) && 
               Objects.equals(this.objectName, other.objectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verbString, objectName);
    }

    @Override
    public String toString() {
        return "Command{" +
                "verb='" + verb + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
