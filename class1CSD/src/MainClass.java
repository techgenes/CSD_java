/**
 * Created by achal on 2/24/16.
 */
public class MainClass {
    public static void main(String[] args){


        Bulb bulb1=new Bulb();
      //  Bulb bulb2=new Bulb();
        bulb1.tellColor();
        bulb1.setOn();
        bulb1.turnOff();

        System.out.println(bulb1.isOn);

    }
}
