package bsu.comp152;

/**
 * Main - A (container) class for client code
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.77, 2.3);
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
        System.out.println(rect1);

        // rect1.setLength(5.77);
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());

        Rectangle rect2 = new Rectangle(5.77, 2.3);
        // Don't use == to compare objects!!
        System.out.println(rect1 == rect2);
        // Use an equals method.
        System.out.println(rect1.equals(rect2));
    }
}
