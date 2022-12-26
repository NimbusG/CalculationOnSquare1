import java.util.Scanner;

public class Square {
    public double x; //abscissa centre
    public double y; // ordinate centre
    public double s; // side

    public void printSquare(){
        System.out.println("Square with centre ("+x+";"+y+") and side " + s);
    }
    public static void main(String[] args){
       //Perimeter of a square

        Scanner s = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        double a = s.nextDouble();
            double perimeter = 4 * a;
        System.out.println("perimeter of Square is: " + perimeter);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        //Distance between two points

        double x = Math.pow(x2-x1, 2);
        double y = Math.pow(y2-y1, 2);
        double distance = Math.sqrt(x+y);
        return distance;
    }


}

