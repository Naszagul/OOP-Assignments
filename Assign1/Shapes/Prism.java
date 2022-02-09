package Shapes;

import Shapes.*;
import Shapes.Comparator.*;

public class Prism extends Shape {
    public double side;
    
    public int compareTo(Shape s) {
        return this.getHeight().compareTo(s.getHeight());
        //return compare(this, s);
    }

    public int compare(Shape s){
        if (this.getBaseArea() > s.getBaseArea(){
            return +1;
        return this.getVolume().compareTo(s.getVolume());
    }

}