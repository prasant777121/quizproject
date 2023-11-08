package com.example.javafxdemo.controller;

import com.example.javafxdemo.Application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class DashboardController {
    @FXML
    private Label accountNameText;
    private Application application;

    public void setAccountName(String accountName) {
        accountNameText.setText("Welcome, " + accountName);
    }


    @FXML
    private void playQuizButtonClicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javafxdemo/quiz-page.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Quiz Page");
            Scene scene = new Scene(root);


            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
