package geschaeft;
import java.awt.Point;
import java.io.Console;
import java.io.IOException;

public class Call_by_Value2 {

    public static void main(String[]... args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(100, 100);
        System.out.println("p1: " + p1.x + "|" + p1.y); // p1: 0|0
        System.out.println("p2: " + p2.x + "|" + p2.y); // p2: 100|100
        pseudoSwap(p1, p2);
        System.out.println("nach Methodendurchlauf:");
        System.out.println("p1: " + p1.x + "|" + p1.y); // p1: 0|0
        System.out.println("p2: " + p2.x + "|" + p2.y); // p2: 100|100
        
        
        Console c = System.console();
        String s = "anfangswert";
        try {
        	s = c.readLine(//"%s","name "
        			);
        } catch (Exception e) {
        	System.out.println("scheiße");
        	e.printStackTrace();
        }
        System.out.println(s);
        
    }
    
    private static void pseudoSwap(Point pp1, Point pp2){
        Point temp = pp1;
        pp1 = pp2;
        pp2 = temp;
        System.out.println("innerhalb pseudoSwap():");
        System.out.println("p1: " + pp1.x + "|" + pp1.y); // p1: 100|100
        System.out.println("p2: " + pp2.x + "|" + pp2.y); // p2: 0|0
        pp1.x = 150;
    }
    

    
} 