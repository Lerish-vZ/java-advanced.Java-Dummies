package com.exp.book6.chapter3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class SceneSwitcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Class fields for Click-Counter scene
    int iClickCount = 0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;

    //Class fields for Add-Subtract scene
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubtract;
    Button btnSwitchToScene1;
    Scene scene2;

    //Class field for stage
    Stage stage;

    @Override
    public void start(Stage primaryStage) {

    }
}
