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

        lblCounter = new Label();
        lblCounter.setText(Integer.toString(iCounter));

        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e -> btnAdd_Click());

        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(e -> btnSubtract_Click());

        btnSwitchToScene1 = new Button();
        btnSwitchToScene1.setText("Switch!");
        btnSwitchToScene1.setOnAction(e -> btnSwitchToScene1_Click());

        HBox pane2 = new HBox(10); //the 10 means the controls have to be seperated by 10 pixels
        pane2.getChildren().addAll(lblCounter, btnAdd, btnSubtract,btnSwitchToScene1);

        scene2 = new Scene(pane2, 300, 75);

        //Set the stage with scene 1 and show the stage
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    //Event handlers for scene 1

    public void btnclickMe_Click() {
        iClickCount++;
        if(iClickCount == 1){
            lblClicks.setText("You have clicked once.");
        } else {
            lblClicks.setText("You have clicked " + iClickCount + " times.");
        }
    }

    
}
