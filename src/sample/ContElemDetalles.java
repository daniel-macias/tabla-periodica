package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContElemDetalles implements Initializable {

    @FXML
    private AnchorPane panelACambiar;

    @FXML
    private Text nombreElemento;

    @FXML
    private ImageView imagenAtomo;

    @FXML
    private ImageView imagenElemento;

    @FXML
    private ImageView imagenEspectro;

    @FXML
    private Text nombreCmb;

    @FXML
    private Text categoriaCmb;

    @FXML
    private Text masaCmb;

    @FXML
    private Text puntoFusCmb;

    @FXML
    private Text puntoEbuCmb;

    @FXML
    private Text aparienciaCmb;

    @FXML
    private Text densidadCmb;

    @FXML
    private Text porCuerpCmb;

    @FXML
    private Text descPorCmb;

    @FXML
    private Text descEnCmb;

    @FXML
    private Text numeroCmb;

    @FXML
    private Text simboloCmb;

    @FXML
    private Text estadoCmb;

    @FXML
    private Text shellsCmb;

    @FXML
    private TextArea textoInformacion;

    private Elemento elementoAUsar;

    @FXML
    void regresarALaTabla(ActionEvent event) {
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("sample.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) panelACambiar.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        elementoAUsar = Main.getListaElementos().get(Main.getNumeroDeElemento() - 1); //Agarra el elemento que sea usado para el gui

        nombreElemento.setText(elementoAUsar.getNombre());
        imagenAtomo.setImage(new Image(elementoAUsar.getSourceDeImgAtom()));  //busca el source de la imagen a poner
        nombreCmb.setText(elementoAUsar.getNombre());
        categoriaCmb.setText(elementoAUsar.getCategoria());
        masaCmb.setText(elementoAUsar.getMasa());
        puntoFusCmb.setText(elementoAUsar.getPuntoDeFusion());
        puntoEbuCmb.setText(elementoAUsar.getPuntoDeEbullicion());
        aparienciaCmb.setText(elementoAUsar.getApariencia());
        densidadCmb.setText(elementoAUsar.getDensidad());
        porCuerpCmb.setText(elementoAUsar.getPorcentajeCuerpoHumano());
        descEnCmb.setText(elementoAUsar.getDescubiertoEn());
        descPorCmb.setText(elementoAUsar.getDescubiertoPor());
        numeroCmb.setText(elementoAUsar.getNumero());
        simboloCmb.setText(elementoAUsar.getSimbolo());
        estadoCmb.setText(elementoAUsar.getEstado());
        shellsCmb.setText(elementoAUsar.getEstado());

        textoInformacion.setText(elementoAUsar.getInfo());

    }
}
