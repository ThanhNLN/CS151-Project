module com.example.michelinrestaurantguide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires json.simple;

    opens com.example.michelinrestaurantguide to javafx.fxml;
    exports com.example.michelinrestaurantguide;
}