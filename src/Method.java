public class Method {
    public String quarter(double x, double y) {
        if (x > 0 && y > 0) {
            return " I ";
        } else if (x > 0 && y < 0) {
            return " IV ";
        } else if (x < 0 && y > 0) {
            return " II ";
        } else if (x < 0 && y < 0) {
            return " III ";
        } else if (x == 0 && y == 0) {
            return " 0 ";
        } else if (x == 0 && y != 0) {
            return " OY ";
        } else return " OX ";
    }
}
