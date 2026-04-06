import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CounterController {

    @FXML
    private Label countLabel;

    @FXML
    private Button increaseButton;

    @FXML
    private Button decreaseButton;

    private int count = 0;

    @FXML
    private void initialize() {
        countLabel.setText(String.valueOf(count));

        increaseButton.setOnAction(e -> {
            count++;
            countLabel.setText(String.valueOf(count));
        });

        decreaseButton.setOnAction(e -> {
            count--;
            countLabel.setText(String.valueOf(count));
        });

        // Set component IDs as required
        countLabel.setId("countLabel");
        increaseButton.setId("increaseButton");
        decreaseButton.setId("decreaseButton");
    }
}