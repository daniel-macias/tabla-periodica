package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    private static ArrayList<Elemento> listaElementos = new ArrayList<>();
    private static int numeroDeElemento = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tabla Periodica");
        primaryStage.setScene(new Scene(root, 1310, 687));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public static int getNumeroDeElemento() {
        return numeroDeElemento;
    }

    public static void setNumeroDeElemento(int numeroDeElemento) {
        Main.numeroDeElemento = numeroDeElemento;
    }
}
