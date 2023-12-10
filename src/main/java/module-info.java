module com.exampleapp.exampleapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;

    opens com.exampleapp.exampleapp to javafx.fxml;
    exports com.exampleapp.exampleapp;
}