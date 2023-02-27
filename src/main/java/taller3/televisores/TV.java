package taller3.televisores;

public class TV {

    private static int numTV = 0;
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(Marca str, boolean Estado){
        this.marca = str;
        this.estado = Estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV++;
    }   
    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca mar){
        this.marca = mar;
    }
    public Control getControl(){
        return control;
    }
    public void setControl(Control Con){
        this.control = Con;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int pre){
        this.precio = pre;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int Vol){
        this.volumen = Vol;
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int can){
        this.canal = can;
    }
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int num){
        numTV = num;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if (estado == true){
            if (canal > 0 && canal <= 120){
                canal++;
            }
        }
    }
    public void canalDown(){
        if (estado == true){
            if (canal > 0 && canal <= 120){
                canal--;
            }
        }
    }
    public void volumenUp(){
        if (estado == true){
            if (volumen >= 0 && volumen <= 7){
                volumen++;
            }
        }
    }
    public void volumenDown(){
        if (estado == true){
            if (volumen >= 0 && volumen <= 7){
                volumen--;
            }
        }
    }
}