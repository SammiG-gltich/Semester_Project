/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Sammi
 */
public class SemesterProject extends Application{


    
    public static void main(String[] args) {
     launch(args);
    }  

    
    @Override
    public void start(Stage primaryStage) throws Exception {

    Parent gp= FXMLLoader.load(getClass().getResource("SemesterProject.fxml"));
    
        //display a tutorial document on start
 
    
            
    primaryStage.setScene( new Scene(gp));
    
    primaryStage.show();
    
    
    }
    
}


