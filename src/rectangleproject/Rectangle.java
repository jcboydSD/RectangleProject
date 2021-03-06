package rectangleproject;

import java.util.Scanner;

public class Rectangle {
    
    //Declarations
    Scanner stdIn = new Scanner(System.in);
    private int length;
    private int width;
    
    public void setLength()
    {
        System.out.print("Please enter length: ");
        this.length = stdIn.nextInt();
    } //end setLength
    
    public void setWidth()
    {
        System.out.print("Please enter width: ");
        this.width = stdIn.nextInt();
    } //end setWidth
    
    public int getLength()
    {
        return this.length;
    } //end getLength
    
    public int getWidth()
    {
        return this.width;
    } //end getWidth
    
    public boolean isSquare()
    {
        return this.length == this.width;
    } //end isSquare
    
    public void printRectangleData()
    {
        int perimeter = (2 * this.length) + (2 * this.width);
        int area = this.length * this.width;
        System.out.printf("Perimeter: %d\n", perimeter);
        System.out.printf("Area: %d\n", area);
    }
    
} //end class Rectangle
