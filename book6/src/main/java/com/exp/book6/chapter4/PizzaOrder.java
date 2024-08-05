package com.exp.book6.chapter4;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class PizzaOrder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage;
    TextField txtName;
    TextField txtPhone;
    TextField txtAddress;
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    RadioButton rdoThin;
    RadioButton rdoThick;
    CheckBox chkPepperoni;
    CheckBox chkMushrooms;
    CheckBox chkAnchovies;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        //Create the name label and text field
        Label lblName = new Label("Name: ");
        txtName = new TextField();
        txtName.setMinWidth(100);
        txtName.setPrefWidth(200);
        txtName.setMaxWidth(300);
        txtName.setPromptText("Enter Name Here");

        //Create the phone number label and text field
        Label lblPhone = new Label("Phone Number: ");
        txtPhone = new TextField();
        txtPhone.setMinWidth(60);
        txtPhone.setPrefWidth(120);
        txtPhone.setMaxWidth(180);
        txtPhone.setPromptText("Enter the phone number here");

        //Create the addess label and text field
        Label lblAddress = new Label("Adress: ");
        txtAddress = new TextField();
        txtAddress.setMinWidth(100);
        txtAddress.setPrefWidth(200);
        txtAddress.setMaxWidth(300);
        txtAddress.setPromptText("Enter the address here");

        //Create the size pane
        Label lblSize = new Label("Size");
        rdoSmall = new RadioButton("Small");
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);
        ToggleGroup groupSize = new ToggleGroup();
        rdoSmall.getToggleGroup(groupSize);
        rdoMedium.getToggleGroup(groupSize);
        rdoLarge.getToggleGroup(groupSize);

        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
        paneSize.setSpacing(10);

        //Create the crust pane
        Label lblCrust = new Label("Crust");
        rdoThin = new RadioButton("Thin");
        rdoThick = new RadioButton("Thick");
        rdoThin.setSelected(true);
        ToggleGroup groupCrust = new ToggleGroup();
        rdoThin.setToggleGroup(groupCrust);
        rdoThick.setToggleGroup(groupCrust);

        VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);
        paneCrust.setSpacing(10);

        //Create the toppings pane
        Label lblToppings = new Label("Toppings");
        chkPepperoni = new CheckBox("Pepperoni");
        chkMushrooms = new CheckBox("Mushrooms");
        chkAnchovies = new CheckBox("Anchovies");

        VBox paneToppings = new VBox(lblToppings, chkPepperoni, chkMushrooms, chkAnchovies);
        paneToppings.setSpacing(10);

        //Create the buttons
        Button btnOK = new Button("OK");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnOK_Click);

        Button btnCancel = new Button("Cancel");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnCancel_Click);

        HBox paneButtons = new HBox(10, btnOK, btnCancel);
    }
}
