package com.example.demo2.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MarketControl {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}