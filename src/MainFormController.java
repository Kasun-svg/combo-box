import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {


    public TextField txtName;
    public TextField txtAnswer;
    public Button btnPrint;
    public TextField txtPrintName;
    public TextField txtNameR;
    public TextField txtPrintNameR;

    public void onKeyPressedAcion(KeyEvent keyEvent) {
        String value = txtName.getText();
        txtPrintName.setText(value);
    }

    public void onKeyReleased(KeyEvent keyEvent) {
        String value = txtNameR.getText();
        txtPrintNameR.setText(value);
    }
}