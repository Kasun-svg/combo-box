
import javafx.scene.control.TextField;

public class MainFormController {


    public TextField txtEmail;
    public TextField txtResult;

    public void initialize() {
        txtEmail.textProperty().addListener((observable, oldValue, newValue) ->{
                    System.out.println("new value : " + newValue );
                    System.out.println("old value : " + oldValue);
txtResult.setText(newValue);
                }
        );


    }
}