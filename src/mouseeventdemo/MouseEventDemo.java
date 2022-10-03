/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mouseeventdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ivan
 */
public class MouseEventDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        //Setting title
        primaryStage.setTitle("MouseEvent");
        
        //Text
        Text text = new Text("Programing is fun");
        text.setX(100);
        text.setY(100);
        
        //Mouse event
        text.setOnMouseDragged( e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });
        
        //Pane and scene
        Pane root = new Pane();
        root.getChildren().add(text);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
