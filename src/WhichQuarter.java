import java.util.Scanner;

public class WhichQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzedną X");
        double x = scanner.nextDouble();
        System.out.println("Podaj współrzedną Y");
        double y = scanner.nextDouble();
        Method method = new Method();
        String quarter = method.quarter(x, y);
        System.out.println("Punkt (" +x +", " +y + ") leży w" +quarter +"ćwiartce układu współrzędnych.");
/*
        String quarter2 = method.witchQuatrer(x, y);
        System.out.println("Punkt (" +x +", " +y + ") leży w" +quarter2 +"ćwiartce układu współrzędnych.");

        String quarter3 = method.noQuaater(x, y);
        System.out.println("Punkt nie leży w ćwiartce, ale na " +quarter3);
 */
    }
}

