package com.example.michelinrestaurantguide;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {
    @FXML
    private ListView listView;
    @FXML
    private Label welcomeText, selectText;

    @FXML
    private Button select;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    @FXML
    private void handleLocationOption(ActionEvent event) {

        //System.out.println("Location Option clicked");
        updateListView("*Display Location Options here*");
    }

    @FXML
    private void handleCuisineOption(ActionEvent event) {
        //System.out.println("Cuisine Option clicked");
        updateListView("*Display Cuisine Options here*");


    }

    @FXML
    private void handlePriceOption(ActionEvent event) {
        //System.out.println("Price Option clicked");
        updateListView("*Display Price Options here*");

    }

    private void updateListView(String message){
        //get items from json file?
        listView.setVisible(true);
        select.setVisible(true);
        ObservableList<String> items = FXCollections.observableArrayList(message);
        listView.setItems(items);
    }


    @FXML
    private void handleSelection(ActionEvent actionEvent) {
        //based on selected/highlighted option list, update list when select button is clicked

    }
}