import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    String coordinate1;
    String coordinate2;
    private LinearEquation line;

    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        line = null;
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }
    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        getCoordinates();
        getPoints();
        line.lineInfo();
        coordinatePair();
        continueGame();
        while (continueGame()) {
            getCoordinates();
            getPoints();
            line.lineInfo();
            coordinatePair();
        }
    }
    public void getCoordinates() {
        System.out.print("Enter coordinate 1: ");
        coordinate1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coordinate2 = scan.nextLine();
    }
    public void getPoints() {
        int commaIndex1 = coordinate1.indexOf(",");
        int commaIndex2 = coordinate2.indexOf(",");
        int coordinate1Length = coordinate1.length();
        int coordinate2Length = coordinate2.length();
        int x1 = Integer.parseInt(coordinate1.substring(1, commaIndex1));
        int x2 = Integer.parseInt(coordinate2.substring(1, commaIndex2));
        int y1 = Integer.parseInt(coordinate1.substring(commaIndex1 + 2, coordinate1Length - 1));
        int y2 = Integer.parseInt(coordinate2.substring(commaIndex2 + 2, coordinate2Length - 1));
        line = new LinearEquation(x1, x2, y1, y2);
    }
    public void coordinatePair() {
        System.out.println("Enter a value for x: ");
        double xCoord = scan.nextDouble();
        System.out.println(line.coordinateForX(xCoord));
    }
    public boolean continueGame() {
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String continueGame = scan.nextLine();
        if (continueGame.equals("y")) {
            return true;
        } return false;
    }
}
