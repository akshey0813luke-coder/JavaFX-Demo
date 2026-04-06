import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class CharacterCounterController {

    @FXML
    private TextArea messageTextArea;

    @FXML
    private TextField characterTextField;

    @FXML
    private Label countLabel;

    @FXML
    private void handleCount() {
        String text = messageTextArea.getText();
        String input = characterTextField.getText();

        if (input == null || input.isEmpty()) {
            countLabel.setText("0");
            return;
        }

        char target = input.charAt(0);
        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        countLabel.setText(String.valueOf(count));
    }

    @FXML
    public void initialize() {
        // Required names (IDs)
        messageTextArea.setId("messageTextArea");
        characterTextField.setId("characterTextField");
        countLabel.setId("countLabel");
    }
}