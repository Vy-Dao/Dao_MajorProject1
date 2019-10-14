/*
Author : Vy Dao
Course : CSIS 335
Assignment: Major Project1
Due Date : 10/14/2019
Date handed : 10/14/2019
Description: The program will display a windown that allow users to pick any item, choose payment method, and submit the cart.
After that, users can decide to print the recipe of the item to the text area, or print the inventory cart to the Tableview
 */

package pkgMajorProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainView.fxml"));
        primaryStage.setTitle("Grocery Application");
        primaryStage.setScene(new Scene(root, 1200, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);

    }
}
