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
                    points.add(Punkt3D.addPoint());
                    break;
                case 2:
                    for(Punkt3D p : points){
                        System.out.println("X: " + p.getX() + "\nY: " + p.getY() + "\nZ: " + p.getZ() + "\n");
                    }
                    break;
                case 4:
                    runProgram = false;
                    break;
            }
        }
    }
}

