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
    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }

    // Here are mutator or setter instance methods:

    public void setLength(double len){
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
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
        return ("length = " + length + ", width = " +
                + width);
    }

    public boolean equals(Rectangle other){
        return (length == other.length) &&
                (width == other.width);
    }
}
