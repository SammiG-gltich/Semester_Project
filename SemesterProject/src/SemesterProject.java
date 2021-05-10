/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sammi
 */
public class SemesterProject extends Application{

    Image firstCard; 
    Image secondCard; 
    Image thirdCard; 
    Image fourthCard;
    ImageView fCard;
    ImageView sCard;
    ImageView tCard;
    ImageView foCard;
    
    public static void main(String[] args) {
     launch(args);
    }
    //display a tutorial document on start
    
    @Override
    public void start(Stage primaryStage) throws Exception {

    Parent gp= FXMLLoader.load(getClass().getResource("SemesterProject.fxml"));
    
    
            
    primaryStage.setScene( new Scene(gp));
    
    primaryStage.show();
    
    
    }
    
}


