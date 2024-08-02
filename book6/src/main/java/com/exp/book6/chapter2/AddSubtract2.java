package com.exp.book6.chapter2;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class AddSubtract2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        //Create a ClickHandler instance
        ClickHandler ch = new ClickHandler();

        //Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch);

        //Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch);

        //Create the Label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //Add the buttons and label to an HBox pane
        HBox pane = new HBox(50);
        pane.getChildren().addAll(btnAdd, btnSubtract, lbl);

        //Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);

        //Add the scene to the stage, set the title and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Subtract");
        primaryStage.show();
    }
}
