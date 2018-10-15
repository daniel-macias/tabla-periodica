package sample;

public class Elemento {
    private String nombre;
    private String categoria;
    private String masa;
    private String puntoDeFusion;
    private String puntoDeEbullicion;
    private String apariencia;
    private String densidad;
    private String porcentajeCuerpoHumano;
    private String descubiertoPor;
    private String descubiertoEn;
    private String numero;
    private String simbolo;
    private String estado;
    private String shells;

    private String info;
    private String fotoAtomo;
    private String fotoEspectro;
    private String fotoEjemplo;

    public Elemento(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getPuntoDeFusion() {
        return puntoDeFusion;
    }

    public void setPuntoDeFusion(String puntoDeFusion) {
        this.puntoDeFusion = puntoDeFusion;
    }

    public String getPuntoDeEbullicion() {
        return puntoDeEbullicion;
    }

    public void setPuntoDeEbullicion(String puntoDeEbullicion) {
        this.puntoDeEbullicion = puntoDeEbullicion;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    public String getPorcentajeCuerpoHumano() {
        return porcentajeCuerpoHumano;
    }

    public void setPorcentajeCuerpoHumano(String porcentajeCuerpoHumano) {
        this.porcentajeCuerpoHumano = porcentajeCuerpoHumano;
    }

    public String getDescubiertoPor() {
        return descubiertoPor;
    }

    public void setDescubiertoPor(String descubiertoPor) {
        this.descubiertoPor = descubiertoPor;
    }

    public String getDescubiertoEn() {
        return descubiertoEn;
    }

    public void setDescubiertoEn(String descubiertoEn) {
        this.descubiertoEn = descubiertoEn;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getShells() {
        return shells;
    }

    public void setShells(String shells) {
        this.shells = shells;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFotoAtomo() {
        return fotoAtomo;
    }

    public void setFotoAtomo(String fotoAtomo) {
        this.fotoAtomo = fotoAtomo;
    }

    public String getFotoEspectro() {
        return fotoEspectro;
    }

    public void setFotoEspectro(String fotoEspectro) {
        this.fotoEspectro = fotoEspectro;
    }

    public String getFotoEjemplo() {
        return fotoEjemplo;
    }

    public void setFotoEjemplo(String fotoEjemplo) {
        this.fotoEjemplo = fotoEjemplo;
    }

    public String getSourceDeImgAtom(){
        String source = "file:D:\\DocsHDD\\Cosas TEC\\POO\\TablaPeriodica\\tabla-periodica\\src\\sample\\imgsAtom\\" + numero + ".png";
        return source;
    }
}
