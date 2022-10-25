package openclose;

public class MainOC {
    public static void main(String args[])
    {
        // Initializing a cuboid one & declaring dimensions by
        // creating an object of Cuboid class in main() method
        Cuboid cb1 = new Cuboid();

        // Custom entries
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;

        // Similarly, initializing a cuboid2 and declaring dimensions
        // by creating object of Cuboid class in the man() method
        Cuboid cb2 = new Cuboid();

        // Custom entries
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;

        // Initializing a cuboid3 and declaring dimensions by
        // creating object of Cuboid class in the main() method
        Cuboid cb3 = new Cuboid();

        // Custom entries
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;

        // Now, declaring andinitializing Array of cuboids
        Cuboid[] c_arr = new Cuboid[3];
        c_arr[0] = cb1;
        c_arr[1] = cb2;
        c_arr[2] = cb3;

        // Initializing the Application class
        Volume app = new Volume();

        // Getting the total volume
        // using get_total_volume
        double vol = app.get_total_volume(c_arr);

        // Print and Display the Total Volume
        System.out.println("The total volume is " + vol);
    }
}
