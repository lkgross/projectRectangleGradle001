package bsu.comp152;

/**
 * Main - A (container) class for client code
 */
public class Main {
    public static void main(String[] args) {
        // Do an inline initialization of a Rectangle object rect1.
        // We say rect1 is an instance of the Rectangle class.
        Rectangle rect1 = new Rectangle(5.77832, 2.31071);
        System.out.printf("The rectangle has approximate dimensions %f x %f \n", rect1.getLength(),
                rect1.getWidth());
        System.out.printf("The rectangle has approximate dimensions %6.2f x %6.2f\n", rect1.getLength(),
                rect1.getWidth());

        // DON'T do a reference copy like
        Rectangle rect3 = rect1;

        /*
         * After we write a constructor that takes
         * two parameters, the default constructor
         * with zero parameters doesn't work by
         * default anymore.
         */
        // Rectangle rect2 = new Rectangle();

        System.out.println(rect1.toString());

        // If you try to print an object,
        // then Java will automatically look for a
        // toString method.
        System.out.println(rect3);

        rect1.setLength(5.77);

        // Because of the reference copy, you can't alter rect1 without altering rect3.
        System.out.println(rect1);
        System.out.println(rect3);

        Rectangle rect4 = new Rectangle();

        System.out.println(rect1);
        System.out.println(rect4);

        // One good way to copy is with a copy method.
        // Overwrite rect4 with a copy of rect1.
        rect4.copy(rect1);

        System.out.println(rect1);
        System.out.println(rect4);

        // Now we can alter rect1 without altering rect3.
        rect1.setLength(2);

        System.out.println(rect1);
        System.out.println(rect4);

        // Another good way to copy is with a copy constructor.
        Rectangle rect5 = new Rectangle(rect1);

        System.out.println(rect1);
        System.out.println(rect5);

        Rectangle rect2 = new Rectangle(5.77, 2.3);
        // Don't use == to compare objects!!
        System.out.println(rect1 == rect2);
        // Use an equals method.
        System.out.println(rect1.equals(rect2));

        /* Let's do comparisons between creating and manipulating
         * Rectangle objects and creating and manipulating String
         * objects.
         */
        String name = "Laura";
        String name2 = new String("Laura");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name);
        System.out.println(name2);
        // Don't use == to compare objects!!
        System.out.println(name == name2);
        // Use an equals method.
        System.out.println(name.equals(name2));
    }
}
