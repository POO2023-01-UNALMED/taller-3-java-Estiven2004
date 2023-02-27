package taller3.televisores;

public class Control{
    private TV tv;

    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void setCanal(int cana){
        tv.setCanal(cana);
    }
    public void enlazar(TV tv1){
        this.tv = tv1;
        tv1.setControl(this);
    }
}