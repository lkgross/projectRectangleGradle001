package bsu.comp152;

/**
 * Rectangle - A (blueprint) class for Rectangle objects
 */
public class Rectangle {

    /* Objects have information and actions associated with them. */

    /* We store the information in "instance variables".
     * We keep the data private:
     * The data length and width are accessible directly only from
     * inside the Rectangle class.
     */
    private double length;
    private double width;

    // Here is a constructor for the Rectangle class:

    /* This constructor takes two parameters.
     * Constructors have no return type---
     * not even void!
     * The name of the constructor is same
     * as the name of the class!
     */
    public Rectangle(double length, double width){
        /* If you use parameter names that are the
         * same as the instance variable names,
         * then use the reference variable this
         * to distinguish between them.
         */
        this.length = length;
        this.width = width;
    }

    // We can do constructor overloading: write more
    // than one constructor.
    // Their "signatures" must differ:
    // They have the same name, but they need a different
    // number of parameters or different types of parameters.
    public Rectangle(){
        // One constructor can call another using this
        // in the first line:
        this(0.0, 0.0);
        // Another way is to use:
        // length = 0.0;
        // width = 0.0;
    }

    // Write a copy constructor:
    public Rectangle(Rectangle other){
        length = other.length;
        width = other.width;
        // Alternatively we could have the body of the
        // constructor as:
        // this(other.length, other.width);
    }

    // Here are mutator or setter instance methods:

    /* public void setLength(double len){
        length = len;
    }*/

    /* We can use the same name for the parameter
     * as for the instance variable if we use the
     * reference variable this.
     */
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double wid){
        width = wid;
    }

    public void copy(Rectangle other){
        length = other.length;
        width = other.width;
    }

    // Here are accessor or getter instance methods:

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public String toString(){
        return String.format("length = %f, width = %f",
                length, width);
    }

    public boolean equals(Rectangle other){
        return (length == other.length) &&
                (width == other.width);
    }
}
