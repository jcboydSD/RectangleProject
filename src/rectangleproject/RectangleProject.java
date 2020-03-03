package rectangleproject;

/******************************************************************************
 * RectangleProject.java 
 * Programmer: @author jcboyd
 * Version: 2.0
 * Course: SDEV 2210
 *
 * This program calculates the perimeter and area of a rectangle based on 
 * user input of the length and width
 *****************************************************************************/

public class RectangleProject {

    public static void main(String[] args) {
        String type = "rectangle";
        System.out.println("Ch 6: Rectangle Project by JC Boyd\n");
        Rectangle userInput = new Rectangle();
        userInput.setLength();
        userInput.setWidth();
        if (userInput.isSquare())
        {
            type = "square";
        } //end if     
        System.out.printf("This paper is a %s: %d x %d\n", type, 
                userInput.getLength(), userInput.getWidth());
        userInput.printRectangleData();
    } //end main
    
} //end class RectangleProject
