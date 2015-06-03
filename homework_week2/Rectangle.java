package ITEducation.homework_week2;

import class_week_2_day1.Figure;
import sun.security.provider.SHA;

import java.util.Arrays;

/**
 * Created by Администратор on 25.05.2015.
 */
public class Rectangle extends Shape {

    public Rectangle(Point[] points) {
        super(points);
    }

    public void perimeter (){
        int perimeter=0;
        int a=(getPoints()[1].getY()-getPoints()[0].getY());//a=Y.points1-Y.points0
        int b=(getPoints()[3].getX()-getPoints()[0].getX());//b=X.points3-x.points0
        perimeter=(a+b)*2;
        System.out.println("Perimeter Rectangle: "+perimeter);
    }

    public void square (){
        int square=0;
        int a=(getPoints()[1].getY()-getPoints()[0].getY());//a=Y.points1-Y.points0
        int b=(getPoints()[3].getX()-getPoints()[0].getX());//b=X.points3-x.points0
        square=(a*b);
        System.out.println("Square Rectangle: " +square);
    }

    public String toString (){
        return ("Rectangle" + Arrays.deepToString(getPoints()));
    }
}
