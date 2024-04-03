import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int pointNum = scan.nextInt();
        double[] coordX = new double[pointNum];
        double[] coordY = new double[pointNum];
        System.out.println("Enter coordinates clockwise");
        for (int i = 0; i < pointNum; i++) {
            System.out.print("x" + (i + 1) + " = ");
            coordX[i] = scan.nextDouble();
            System.out.print("y" + (i + 1) + " = ");
            coordY[i] = scan.nextDouble();
        }
        double area = calculatingArea(coordX, coordY);
        System.out.println("Area = " + area);
    }
    public static double calculatingArea(double coordinatesX[],double coordinatesY[]){
                double leftPar = 0, rightPar = 0;
        for (int j = 0; j <= coordinatesX.length - 1; j++) {
            if (j < coordinatesX.length - 1) {
                leftPar += coordinatesX[j] * coordinatesY[j + 1];
                rightPar += coordinatesY[j] * coordinatesX[j + 1];
            } else {
                leftPar += coordinatesX[j] * coordinatesY[0];
                rightPar += coordinatesY[j] * coordinatesX[0];
            }
        }
        double area = (leftPar - rightPar) / 2;
        return area;
    }

}
//student Daniil Radevich