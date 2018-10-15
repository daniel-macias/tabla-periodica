package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private AnchorPane tablaPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        llenarListaDeElementos();


        for(Node elem : tablaPane.getChildren()){
            if(elem.getAccessibleText() != null){
                elem.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    System.out.println(elem.getAccessibleText());
                    Main.setNumeroDeElemento(Integer.parseInt(elem.getAccessibleText())); //Poniendo este numero en main para ser usado por el gui
                    cargarDetallesElem();
                });
            }
        }
    }

    public void llenarListaDeElementos(){
        lectorDeJSON lector = new lectorDeJSON();
        for(int i = 0; i < 118; i++){
            lector.leerJSONElem(i);
        }

        System.out.println("Carga de Elementos Terminada");
    }

    private void cargarDetallesElem(){  //Acepta el id de escena a cual quiere cambiar
        try {
            Parent  sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("ElemDetalles.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) tablaPane.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }


}
