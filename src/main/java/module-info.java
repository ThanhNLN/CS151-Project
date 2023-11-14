module com.example.michelinrestaurantguide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires json.simple;

    opens com.example.michelinrestaurantguide to javafx.fxml;
    exports com.example.michelinrestaurantguide;
}