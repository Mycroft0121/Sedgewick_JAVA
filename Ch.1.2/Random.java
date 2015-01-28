import java.lang.Math;
public class Random {

    public static void main(String[] args) {
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt(args[1]);
        double r = Math.floor(Math.random()*(b-a+1)+a);
        System.out.print(r);
            
    }

}
