
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {


    public ComboBox<String> cmbLanguage;

    ArrayList<String> myLanguages = new ArrayList<>(
            Arrays.asList("java", "PHP", "Koltin", "Ruby")
    );

    public void initialize() {
        for (String name : myLanguages) {
            cmbLanguage.getItems().add(name);
        }

    }


}




