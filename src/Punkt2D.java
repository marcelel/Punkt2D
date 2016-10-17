/**
 * Created by marcelel on 17.10.16.
 */
import java.lang.Math;

public class Punkt2D {
    protected double x;
    protected double y;

    public Punkt2D(double _x, double _y){
        x = _x;
        y = _y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double _x){
        x = _x;
    }
    public void setY(double _y){
        y = _y;
    }
    double distance(Punkt2D obj){
        return Math.sqrt(Math.pow((obj.x - x), 2) + Math.pow((obj.y - y), 2));
    }
}
