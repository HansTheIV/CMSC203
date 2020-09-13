import java.util.Scanner;
import java.lang.Math.*;

public class SphereVolume
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        double diam, sphereRadius, sphereVolume;

        System.out.println("This program will calculate the volume of a sphere based on its diameter.");

        System.out.println("Enter the diameter of a sphere in feet: ");
        diam = sc.nextDouble();
        sphereRadius = diam / 2.0;

        sphereVolume = (Math.PI * Math.pow(sphereRadius, 3))* (4.0/3.0);
        String output = "The volume of a sphere with a diameter of " + diam + " feet is " + sphereVolume +
                " feet cubed";
        System.out.println(output);
// add your declaration and code here
    }
}
