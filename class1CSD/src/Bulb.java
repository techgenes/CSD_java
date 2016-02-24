/**
 * Created by achal on 2/24/16.
 */
public class Bulb {

    public boolean isOn;
    public int power;
    public int price;

    public void tellColor(){
        System.out.println("I am yellow");
    }

    public void setOn(){
        System.out.println("I am on");
        isOn=true;
    }
    public void turnOff(){
        System.out.println("I am off");
        isOn=false;
    }

}
