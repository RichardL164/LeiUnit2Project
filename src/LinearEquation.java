public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double roundToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
    public String equation() {
        return "y = " + slope() + "x + " + yIntercept();
    }
    public double slope() {
        if (y1 == y2) {
            double slope = y1;
            return roundToHundredth(slope);
        } else {
            double slope = (double) (y2 - y1) / (x2 - x1);
            return roundToHundredth(slope);
        }
    }
    public double yIntercept() {
        double yIntercept = y1 - slope() * x1;
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
    public void lineInfo() {
        if (x1 != x2) {
            System.out.println("The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
            System.out.println("The equation of the line between these two points is: " + equation());
            System.out.println("The slope of this line is: " + slope());
            System.out.println("The y-intercept of this line is: " + yIntercept());
            System.out.println("The distance between these points is: " + distance());
        }
        else {
            System.out.println("These points are on a vertical line x = " + x1);
        }
    }
}
