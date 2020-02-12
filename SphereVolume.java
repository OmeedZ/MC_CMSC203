import java.util.Scanner;

public class SphereVolume {
	
	public static void main(String[] args) 
	{ 
			Scanner scanner=new Scanner(System.in);
	       double diameter;
	       double volume;
	       System.out.println("Calculating the Volume of a Sphere....");
	      
	       System.out.println("Enter diameter of sphere : ");
	      
	       diameter=Double.parseDouble(scanner.nextLine());
	      
	       double radius=diameter/2;
	      
	       volume=(4/3.0)*Math.PI*Math.pow(radius, 3.0);
	       System.out.println("Volume of the sphere is: "+volume);
		
	} 

}
