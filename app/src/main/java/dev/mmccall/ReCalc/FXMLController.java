package dev.mmccall.ReCalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private Label label;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("JavaFX " + javafxVersion + ". Running on Java " + javaVersion + ".");
    }

}
