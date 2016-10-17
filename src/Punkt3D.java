/**
 * Created by marcelel on 17.10.16.
 */

import java.util.Scanner;

public class Punkt3D extends Punkt2D{
    private double z;

    public  Punkt3D(double _x, double _y, double _z){
        super(_x, _y);
        z = _z;
    }
    public double getZ(){
        return z;
    }
    public void setZ(double _z){
        z = _z;
    }
    public double distance(Punkt3D obj){
        return Math.sqrt(Math.pow((obj.x - x), 2) + Math.pow((obj.y - y), 2) + Math.pow((obj.z - z), 2));
    }
    public static Punkt3D addPoint(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj x");
        double x = in.nextDouble();
        System.out.println("Podaj y");
        double y = in.nextDouble();
        System.out.println("Podaj z");
        double z = in.nextDouble();
        return new Punkt3D(x, y, z);
    }
}
