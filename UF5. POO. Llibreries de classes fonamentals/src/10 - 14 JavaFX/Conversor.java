
package edu.fje.daw2dam2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Classe que implementa una aplicació de conversions.
 * El descriptor de UI té definit tot el que correspon a les
 * classes TableView i TableColumn
 *  amb JavaFX
 * @author sergi grau
 * @version 1.0 19.01.2015
 */
public class Conversor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent arrel = FXMLLoader.load(getClass().getResource("Conversor.fxml"));
        
        stage.setTitle("Conversor");
        stage.setScene(new Scene(arrel));
        stage.show();
    }
}

