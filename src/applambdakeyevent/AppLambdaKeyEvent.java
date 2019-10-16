/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applambdakeyevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

/**
 *
 * @author rafae
 */
public class AppLambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text txt = new Text(20, 20, "A");
        
        
        Pane root = new Pane();
        root.getChildren().add(txt);
        
        Scene scene = new Scene(root, 300, 250);
        
        scene.setOnKeyPressed(ev ->{
            KeyCode key = ev.getCode();
            double pos;
            if(key==key.DOWN){
                pos=txt.getY()+10;
                if(pos>=scene.getHeight())
                    txt.setY(scene.getHeight());
                else
                    txt.setY(pos);
            }
            else if(key==key.UP){
                pos=txt.getY()-10;
                if(pos<=10)
                    txt.setY(10);
                else
                    txt.setY(pos);
            }
            else if(key==key.RIGHT){
                pos=txt.getX()+10;
                if(pos>=scene.getWidth()-10)
                    txt.setX(scene.getWidth()-10);
                else
                    txt.setX(pos);
            }
            else if(key==key.LEFT){
                pos=txt.getX()-10;
                if(pos<=10)
                    txt.setX(10);
                else
                    txt.setX(pos);
            }
        });
        
        primaryStage.setTitle("Hello World!");
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
