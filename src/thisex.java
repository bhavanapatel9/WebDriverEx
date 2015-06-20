import java.util.Date;

/**
 * Created by Sony on 17/05/2015.
 */



public class thisex extends samplethis
{
    public static void main(String s[]){

    thisex obj= new thisex();
    obj.thisMthod();
        Date d= new Date();
        System.out.println(d.getTime());


}

    public void thisMthod() {
        System.out.println("Derived  class method");

    }

}
