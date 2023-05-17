/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
/**
 *
 * @author MohammedYasserElnaba
 */
public class Login_page extends Stage {
    String identifier = "";
    public Login_page(){};
    public void Login_page1() {
        setTitle("Login Page2");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25));
        
        Label emailLabel = new Label("      email:");
        TextField usernameField = new TextField();
        Label Password = new Label("      password:");
        PasswordField passwordField = new PasswordField();
        
        RadioButton adminRadioButton = new RadioButton("Librarian");
        RadioButton customerRadioButton = new RadioButton("Reader");
        ToggleGroup userTypeToggleGroup = new ToggleGroup();
        adminRadioButton.setToggleGroup(userTypeToggleGroup);
        customerRadioButton.setToggleGroup(userTypeToggleGroup);
      
        
        Button loginButton = new Button("Login");
        LibrarySystem system = new LibrarySystem();

        gridPane.add(usernameField, 0, 0);
        gridPane.add(passwordField, 0, 1);
        gridPane.add(loginButton, 0, 2);
        gridPane.add(adminRadioButton, 1, 2);
        gridPane.add(loginButton, 1, 1);
        
        
         String username = usernameField.getText();
         String password = passwordField.getText();
         
         VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(emailLabel, usernameField, Password, passwordField,
                adminRadioButton, customerRadioButton, loginButton);
        if(adminRadioButton.isSelected()){
            identifier = "l";
             loginButton.setOnAction(e -> {
                 system.login(username, password, identifier);
                 //go to linrarian window
        });
       
    }
        else if(customerRadioButton.isSelected()){
            identifier = "r";
             loginButton.setOnAction(e -> {
                 system.login(username, password, identifier);
        });
        }
        setScene(new Scene(gridPane, 600, 400));
        }
       

        

}








//                MainApp app = new MainApp();
//                app.switchToFrame(Home_page);
////                app.switchToFrame(new HomeFrame());