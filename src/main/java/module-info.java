module com.example.michelinrestaurantguide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.michelinrestaurantguide to javafx.fxml;
    exports com.example.michelinrestaurantguide;
}