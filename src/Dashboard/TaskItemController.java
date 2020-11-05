package Dashboard;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class TaskItemController implements Initializable{
    public ImageView iconSelect;
    public Label lblTaskName;
    public Button btninfo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setTask(TaskModel model) {

        ContextMenu menu = new ContextMenu();
        System.out.println(model.toString());
        lblTaskName.setText(model.getTaskName());

        if(model.getTaskStatus()) {

            btninfo.setText("Complete");
            iconSelect.setImage(new Image(getClass().getResourceAsStream("/icons/tick.png")));
            menu.getItems().add(new MenuItem("Set Task Incomplete"));
        } else if (!model.getTaskStatus()) {

            btninfo.setText("Incomplete");
            iconSelect.setImage(new Image(getClass().getResourceAsStream("/icons/tick_1.png")));
            menu.getItems().add(new MenuItem("Set Task Complete"));
        }

        lblTaskName.setContextMenu(menu);

    }
}
