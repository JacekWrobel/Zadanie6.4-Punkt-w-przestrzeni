public class Method {
    String quarter(double x, double y) {
        if (x > 0 && y > 0) {
            return " I ";
        } else if (x > 0 && y < 0) {
            return " IV ";
        } else if (x < 0 && y > 0) {
            return " II ";
        } else return " III ";
    }



}
