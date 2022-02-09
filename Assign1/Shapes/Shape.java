package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {

    public double height;
    public double volume;
    public double baseArea;

    public Shape (double newHeight, double newVolume, double newBaseArea){
        height = newHeight;
        volume = newVolume;
        newBaseArea = baseArea;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.volume;
    }

    public double getBaseArea(){
        return this.baseArea;
    }
    
    //Use the compareTo method to compare two shapes by height
    //@Override
    public int compareTo(Shape firstShape, Shape secondShape) {

        //if the first shape's height is greater, return 1
        if (firstShape.getHeight() > secondShape.getHeight()){
            return 1;
        }
        //if the second shape's height is greater, return -1
        if (secondShape.getHeight() > firstShape.getHeight()){
            return -1;
        }
        //if they are equal return 0
        else {
            return 0;
        }
    }
    //Use the compare method to compare two shapes by baseArea + volume
    //we use baseArea to find volume, we'll sort by that
    @Override
    public int compare(Shape firstShape, Shape secondShape){
        
        //if the first shape's volume is greater, return 1
        if (firstShape.getVolume() > secondShape.getVolume()){
            return 1;
        }
        //if the second shape's volume is greater, return -1
        if (secondShape.getHeight() > firstShape.getVolume()){
            return -1;
        }
        //if they are equal return 0
        else{
            return 0;
        }
    }

}