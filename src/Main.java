import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by marcelel on 17.10.16.
 */
public class Main {
    private static LinkedList<Punkt3D> points = new LinkedList();

    public static void main(String [ ] args){
        Boolean runProgram = true;
        while (runProgram){
            System.out.println("1. Wczytaj punkt 3D \n2. Wyświetl wszystkie punkty \n3. Oblicz odległość \n4. Zakończ");
            Scanner in = new Scanner(System.in);
            int decision = in.nextInt();
            switch (decision){
                case 1:
                    System.out.println("Podaj wspolrzedne");
                    try {points.add(new Punkt3D(in.nextDouble(), in.nextDouble(), in. nextDouble()));}
                    catch(InputMismatchException e){
                        System.out.println("Zły format");
                   }
                    break;
                case 2:
                    for(Punkt3D p : points){
                        System.out.println("X: " + p.getX() + "\nY: " + p.getY() + "\nZ: " + p.getZ() + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Podaj dwa punkty od 0 do " + points.size());
                    try{
                        int point1 = in.nextInt();
                        int point2 = in.nextInt();
                        if (point1 < 0 || point1 >= points.size() || point2 < 0 || point2 >= points.size()){
                            System.out.println("Złe punkty");
                        }
                        else{
                            System.out.println(points.get(point1).distance(points.get(point2)));
                        }
                    }
                    catch(InputMismatchException e) {
                        System.out.println("Zły format");
                    }
                    break;
                case 4:
                    runProgram = false;
                    break;
            }
        }
    }
}

