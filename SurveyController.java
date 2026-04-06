
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class SurveyController {

    @FXML private ProgressBar progressBar;
    @FXML private TextField nameField, birthField, genderField, numberField, emailField;
    @FXML private Button submitButton;
    @FXML private Label messageLabel;

    @FXML
    public void initialize() {
        nameField.textProperty().addListener((obs, oldVal, newVal) -> updateProgress());
        birthField.textProperty().addListener((obs, oldVal, newVal) -> updateProgress());
        genderField.textProperty().addListener((obs, oldVal, newVal) -> updateProgress());
        numberField.textProperty().addListener((obs, oldVal, newVal) -> updateProgress());
        emailField.textProperty().addListener((obs, oldVal, newVal) -> updateProgress());
        submitButton.setOnAction(e -> handleSubmit());
    }

    private void updateProgress() {
        int filled = 0;
        if (!nameField.getText().isEmpty()) filled++;
        if (!birthField.getText().isEmpty()) filled++;
        if (!genderField.getText().isEmpty()) filled++;
        if (!numberField.getText().isEmpty()) filled++;
        if (!emailField.getText().isEmpty()) filled++;
        progressBar.setProgress(filled / 5.0);
    }

    private void handleSubmit() {
        if (nameField.getText().isEmpty() ||
                birthField.getText().isEmpty() ||
                genderField.getText().isEmpty() ||
                numberField.getText().isEmpty() ||
                emailField.getText().isEmpty()) {
            messageLabel.setText("All fields are required");
        } else {
            messageLabel.setText("Thank you for answering");
        }
    }
}