module com.exp.book6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.exp.book6 to javafx.fxml;
    exports com.exp.book6.chapter3;
    opens com.exp.book6.chapter3 to javafx.fxml;
}