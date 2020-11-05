package Dashboard;

import javafx.scene.image.Image;

public class TaskModel {

    private String taskName;
    private boolean taskStatus;
    private Image icon;

    public TaskModel(String taskName, boolean taskStatus) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) { this.taskName = taskName; }

    public boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) { this.taskStatus = taskStatus; }

    public Image getIcon() {
        return icon;
    }

    public  void setIcon(Image icon) { this.icon = icon; }
    
}
