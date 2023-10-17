public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yIntercept;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public String equation(String coordinate1, String coordinate2) {
        return "y = " + slope + "x + " + yIntercept;
    }
    public double slope() {
        slope = ((double) (y2 - y1) / (x2 - x1));
        return slope;
    }
    public double yIntercept() {
        yIntercept = y1 - slope * x1;
        return yIntercept;
    }
    public double distance() {
        double distanceSquared = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
        double distance = Math.pow(distanceSquared, 0.5);
        return Math.round(distance * 100) / 100.0;
    }
}
