package com.exp.book6.chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;
    int iClickCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        //create button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        //Create the Lable
        lbl = new Label();
        lbl.setText("You have not clicked the button.");

        //Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        //Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        //Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick(){
        if(btn.getText() == "Click me please!"){
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
}
