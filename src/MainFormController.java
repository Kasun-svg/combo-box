import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainFormController {


    public TextField txtName;
    public TextField txtAnswer;
    public Button btnPrint;

    public void OnActionOnPrint(ActionEvent actionEvent) {
        txtAnswer.setText(txtName.getText());
    }
}