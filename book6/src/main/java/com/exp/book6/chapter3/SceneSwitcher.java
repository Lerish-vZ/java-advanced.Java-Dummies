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
        stage = primaryStage;

        //Build the Click-Counter scene

        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");

        btnClickMe = new Button();
        btnClickMe.setText("Click me");
        btnClickMe.setOnAction(e -> btnClickMe_Click());

        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2_Click());

        VBox pane1 = new VBox();
        pane1.getChildren().addAll(lblClicks, btnClickMe, btnSwitchToScene2);

        scene1 = new Scene(pane1, 250, 150);

        //Build the Add-Subtract scene
    }
}
