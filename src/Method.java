public class Method {
    /*
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
    */
    public String quarter(double x, double y) {
        if (x == 0 || y == 0) {
           return isNotInQuarter(x, y);
        } else return isInQuarter(x, y);
    }

    private String isInQuarter(double x, double y) {
        if (x > 0 && y > 0) {
            return " I ";
        } else if (x > 0 && y < 0) {
            return " IV ";
        } else if (x < 0 && y > 0) {
            return " II ";
        } else return " III ";
    }

    private String isNotInQuarter(double x, double y) {
        if (x == 0 && y == 0) {
            return " 0 ";
        } else if (x == 0 && y != 0) {
            return " OY ";
        } else return " OX ";
    }
}
