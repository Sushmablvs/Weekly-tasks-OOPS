import java.text.DecimalFormat;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(diameter / 2, 3);
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(diameter / 2, 2);
    }

    // toString method
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Sphere with diameter " + df.format(diameter);
    }
}

public class MultiSphere {
    public static void main(String[] args) {
        // Instantiate several Sphere objects
        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(7.5);
        Sphere sphere3 = new Sphere(10);

        // Update diameter of sphere1
        sphere1.setDiameter(6);

        // Print details of spheres
        System.out.println(sphere1.toString());
        System.out.println("Volume of sphere1: " + sphere1.calculateVolume());
        System.out.println("Surface area of sphere1: " + sphere1.calculateSurfaceArea());

        System.out.println(sphere2.toString());
        System.out.println("Volume of sphere2: " + sphere2.calculateVolume());
        System.out.println("Surface area of sphere2: " + sphere2.calculateSurfaceArea());

        System.out.println(sphere3.toString());
        System.out.println("Volume of sphere3: " + sphere3.calculateVolume());
        System.out.println("Surface area of sphere3: " + sphere3.calculateSurfaceArea());
    }
}
