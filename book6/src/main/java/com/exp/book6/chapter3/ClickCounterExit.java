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
    }
}
