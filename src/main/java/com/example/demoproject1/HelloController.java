package com.example.demoproject1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button countbutton;

    @FXML
    private Label label1;
    @FXML
    protected Button reset;

    private static int count=0;



    @FXML
    protected void onHelloButtonClick() {
        count++;
        label1.setText(""+count);
    }

    public void resetClicked(){
        count=0;
        label1.setText("0");
    }
}