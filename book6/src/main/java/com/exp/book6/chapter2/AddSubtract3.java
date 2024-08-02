package com.exp.book6.chapter2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent e) {
                                   iCounter++;
                                   lbl.setText(String.valueOf(iCounter));
                               }
                           });

                // Create the Subtract button
                btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(       
    }
}
