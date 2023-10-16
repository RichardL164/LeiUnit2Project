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


    public void getCoordinates() {
        System.out.println("Welcome to the linear equation calculator!");
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
        int x1 = Integer.parseInt(coordinate1.substring(0, commaIndex1));
        int x2 = Integer.parseInt(coordinate2.substring(0, commaIndex2));
        int y1 = Integer.parseInt(coordinate1.substring(commaIndex1 + 2, coordinate1Length));
        int y2 = Integer.parseInt(coordinate2.substring(commaIndex2 + 2, coordinate2Length));
        line = new LinearEquation(x1, x2, y1, y2);
    }
}
