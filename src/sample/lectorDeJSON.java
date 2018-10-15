package sample;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.nio.file.Files;

public class lectorDeJSON {
    public void leerJSONElem(int indice){
        try{
            Elemento eleTemporal = new Elemento();

            JSONParser parser=new JSONParser();
            JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("D:\\DocsHDD\\Cosas TEC\\POO\\TablaPeriodica\\tabla-periodica\\src\\sample\\datos\\Elementos.json"));
            JSONObject elemento= (JSONObject) arregloJson.get(indice);
            eleTemporal.setNombre(elemento.get("name").toString());
            eleTemporal.setApariencia(elemento.get("appearance").toString());
            eleTemporal.setMasa(elemento.get("atomic_mass").toString());
            eleTemporal.setPuntoDeEbullicion(elemento.get("boil").toString());
            eleTemporal.setCategoria(elemento.get("category").toString());
            eleTemporal.setDensidad(elemento.get("density").toString());
            eleTemporal.setDescubiertoPor(elemento.get("discovered_by").toString());
            eleTemporal.setPuntoDeFusion(elemento.get("melt").toString());
            eleTemporal.setNumero(elemento.get("number").toString());
            eleTemporal.setEstado(elemento.get("phase").toString());
            eleTemporal.setSimbolo(elemento.get("symbol").toString());
            eleTemporal.setInfo(elemento.get("summary").toString());
            eleTemporal.setDescubiertoEn(elemento.get("descubierto_en").toString());
            eleTemporal.setPorcentajeCuerpoHumano(elemento.get("porcentaje_humanos").toString());


            Main.getListaElementos().add(eleTemporal);


        }
        catch (FileNotFoundException e){
            System.out.print(e);

        }
        catch (IOException e){
            System.out.print(e);
        }
        catch (ParseException e){
            System.out.print(e);
        }
        catch (NullPointerException e){
            System.out.print(e);
        }
    }
}
