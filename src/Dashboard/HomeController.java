package Dashboard;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    public TextField tfSearch;
    public Label lblProjectCount;
    public Label lblName;
    public Label lblGreeting;
    public Label lblName1;
    public Label lblName11;
    public Label lblName111;
    public VBox vTaskItems;
    public Button btnEX;
    public VBox vTaskItemsUpcoming;

    public ObservableList<TaskModel> listOfTasks;

    public void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btnEX) {
            System.exit(0);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List<TaskModel> model = new ArrayList<>();

        model.add(new TaskModel("Complete the JAVAFX Project", false));
        model.add(new TaskModel("Start Data Structures and Algo", false));
        model.add(new TaskModel("Complete a Django Project", true));

        Node [] nodes = new Node[model.size()];

        for(int i = 0; i < nodes.length; i++){
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("TaskItem.fxml"));
                TaskItemController controller = new TaskItemController();
                loader.setController(controller);

                nodes[i] = loader.load();
                controller.setTask(model.get(i));
                vTaskItems.getChildren().add(nodes[i]);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        for(int i = 0; i < 1; i++){
            try {
                nodes[i] = FXMLLoader.load(getClass().getResource("TaskItem.fxml"));
                vTaskItemsUpcoming.getChildren().add(nodes[i]);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
