package com.exp.book6.chapter3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

public class ClickCounterExit extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        //Create the Click Me button
        Button btnClickMe = new Button("Click me please!");
        btnClickMe.setOnAction(e -> btnClickMe_Click());

        //Create the Close button
        Button btnClose = new Button("Close");
        btnClose.setOnAction(e -> btnClose_CLick());

        //Add the buttons to a layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(btnClickMe, btnClose);
        pane.setAlignment(Pos.CENTER);

        //Add the layout to a scene
        Scene scene = new Scene(pane, 250, 150);

        //Finish and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            btnClose_Click();
        });
        primaryStage.show();
    }

    public void btnClickMe_Click() {
        iClickCount++;
        if (iClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked " + iClickCount + " times.");
            a.showAndWait();
        } 
    }
}
