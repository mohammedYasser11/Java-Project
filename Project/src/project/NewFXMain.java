/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Sara Ashour
 */
public class NewFXMain extends Application {
    Stage window;
    Scene scene2;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        window= primaryStage;
        primaryStage.setTitle("Login Page");

        // Create the username label and text field
        Label emailLabel = new Label("      email:");
        TextField usernameField = new TextField();

        // Create the password label and password field
        Label passwordLabel = new Label("      Password:");
        PasswordField passwordField = new PasswordField();

        // Create the login button
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            // Check the username and password
            String email = usernameField.getText();
            String password = passwordField.getText();
            window.setScene(scene2);

            if (email.equals("omarbayom3006") && password.equals("password")) {
                System.out.println("Login successful!");
                // Add your logic for a successful login
            } else {
                System.out.println("Login failed!");
                // Add your logic for a failed login
            }
        });

        // Create a grid pane and add the components
        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.addRow(0, emailLabel, usernameField);
        grid.addRow(1, passwordLabel, passwordField);
        grid.addRow(2, loginButton);

        // Create the scene and set it on the stage
        Scene scene = new Scene(grid, 600, 500);
        Button label1 = new Button ("welcome");
        VBox Layout = new VBox(20);
        Layout.getChildren().add(label1);
        scene2 = new Scene(Layout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    

    }

    
    
}
