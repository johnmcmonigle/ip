package duke.tasks;
import java.util.ArrayList;

public class ToDo {
    public String doBy = "";
    protected String description;
    protected boolean isDone;

    /**
     * Constructor for Todo (task) object
     *
     * @param description Description of the todo
     * @return the todo object
     */
    public ToDo(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Gets the Task Description
     * @return the task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the task status
     * @param status The status (true/false) of whether the task is done
     */
    public void setDone(boolean status) {
        isDone = status;
    }

    /**
     * Gets the Task Status Icon (X if done, "" if not)
     * @return the status icon
     */
    public String getStatusIcon() {
        String status = (isDone ? "X" : " ");
        String finalString = "[T][" + status + "]";
        return finalString;
    }

    /**
     * Getting for date of deadline
     *
     * @returns the date of the deadline
     */
    public String getDoBy() {
        return this.doBy;
    }
}
