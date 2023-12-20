package spherepractice;
import java.util.*;

public class SpherePractice {
    public static void main(String[] args) {
       System.out.println("System to calculate the surface area of sphere and volume of area");
        double radius;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nPlease enter the radius of the sphere");
        
        radius = sc.nextDouble();
        
        double Sarea =  ((double)4/3) * 3.14 * (radius*radius*radius);;
        double Varea = 4 * 3.14 * (radius*radius);
        
        System.out.printf("The Surface area of the Sphere is %.2f",Sarea);
        System.out.printf("\nThe Volum area of the sphere is %.2f",Varea);
    }
    
}
