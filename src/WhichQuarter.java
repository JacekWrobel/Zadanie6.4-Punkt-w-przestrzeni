import java.util.Scanner;

public class WhichQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzedną X");
        double x = scanner.nextDouble();
        System.out.println("Podaj współrzedną Y");
        double y = scanner.nextDouble();
        Method method = new Method();
        String result = method.quarter(x, y);
        System.out.println("Punkt (" + x + ", " + y + ") leży w ćwiartce " + result);
    }
}

