package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {

    public double height;
    public double sideLengthRadius;
    public double volume;
    public double baseArea;
    public String title;
    //shapes are read in from the text file with a height value
    // and a side or length, depending on the shape
    // public Shape (double newHeight, double newSideLengthRadius){
    //     height = newHeight;
    //     sideLengthRadius = newSideLengthRadius;
    // }

    public double getHeight(){
        return this.height;
    }

    public String getTitle(){
        return this.title;
    }

    public double getVolume(){
        return this.volume;
    }

    public double getBaseArea(){
        return this.baseArea;
    }
    
    //Use the compareTo method to compare two shapes by height
    @Override
    public int compareTo(Shape secondShape) {

        //if the first shape's height is greater, return 1
        if (this.getHeight() > secondShape.getHeight()){
            return 1;
        }
        //if the second shape's height is greater, return -1
        if (this.getHeight() < secondShape.getHeight()){
            return -1;
        }
        //if they are equal return 0
        else {
            return 0;
        }
    }
    
    //Use the compare method to compare two shapes by baseArea + volume
    //we use baseArea to find volume, we'll sort by that
    //@Override
    public int compare(Shape secondShape){
        
        //if the first shape's volume is greater, return 1
        if (this.getVolume() > secondShape.getVolume()){
            return 1;
        }
        //if the second shape's volume is greater, return -1
        if (this.getVolume() < secondShape.getVolume()){
            return -1;
        }
        //if they are equal return 0
        else{
            return 0;
        }
    }
}