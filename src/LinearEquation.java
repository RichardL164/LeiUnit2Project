public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double roundToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
    public String equation() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;
        String equation = "";
        if ((double) numerator / denominator == 1) {
            equation += "x";
        } else if ((double) numerator / denominator == -1) {
            equation += "-x";
        } else if (numerator == 0) {
            return "y = " + yIntercept();
        } else if ((double) numerator / denominator < 0) {
            if (numerator % denominator == 0){
                equation += numerator / denominator + "x";
            } else {
                equation += "-" + Math.abs(numerator) + "/" + Math.abs(denominator) + "x";
            }
        } else {
            if (numerator % denominator == 0){
                equation += numerator / denominator + "x";
            } else {
                equation += Math.abs(numerator) + "/" + Math.abs(denominator) + "x";
            }
        }

        if (yIntercept() != 0) {
            if (yIntercept() > 0) {
                equation += " + " + yIntercept();
            } else {
                equation += " - " + Math.abs(yIntercept());
            }
        }
        return "y = " + equation;
    }
    public double slope() {
        if (y1 == y2) {
            double slope = 0;
            return roundToHundredth(slope);
        } else {
            double slope = (double) (y2 - y1) / (x2 - x1);
            return roundToHundredth(slope);
        }
    }
    public double yIntercept() {
        if (slope() != 0) {
            double yIntercept = y1 - slope() * x1;
            return roundToHundredth(yIntercept);
        }
        double yIntercept = y1;
        return roundToHundredth(yIntercept);
    }
    public double distance() {
        double distanceSquared = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
        double distance = Math.pow(distanceSquared, 0.5);
        return roundToHundredth(distance);
    }
    public String coordinateForX(double x) {
        double yCoord = x * slope() + yIntercept();
        return "The point on the line is: (" + x + ", " + roundToHundredth(yCoord) + ")";
    }
    public String lineInfo() {
        String info = "";
        if (x1 != x2) {
            String twoPoints = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
            String lineEquation = "The equation of the line between these two points is: " + equation();
            String slope = "The slope of this line is: " + slope();
            String yIntercept = "The y-intercept of this line is: " + yIntercept();
            String distance = "The distance between these points is: " + distance();
            info += twoPoints + "\n" + lineEquation + "\n" + slope  + "\n" + yIntercept  + "\n" + distance;
            return info;
        }
        else {
            return "These points are on a vertical line x = " + x1;
        }
    }
}
