package ITEducation.homework_week2;

import java.util.Arrays;

/**
 * Created by Администратор on 25.05.2015.
 */
public class Triangle extends Shape{
    int cathetusFirst=(getPoints()[1].getY()-getPoints()[0].getY());//a=cathetusFirst=Y.points1-Y.points0
    int cathetusSecond=(getPoints()[3].getX()-getPoints()[0].getX());//b=cathetusSecond=X.points3-X.points0
    int hypotenuse=(int)Math.sqrt((Math.pow(cathetusFirst, 2)+Math.pow(cathetusSecond, 2)));//c=hypotenuse=X.points3-X.points0
    int poluperimeter=((cathetusFirst+cathetusSecond+hypotenuse)/2); //p=(a+b+c)/2
    int radius=(int)Math.sqrt((((poluperimeter-cathetusFirst)*(poluperimeter-cathetusSecond)*(poluperimeter-hypotenuse))/poluperimeter));//	r=Math.sqrt(((p−a)(p−b)(p−c))/p)

    public Triangle(Point[] points) {
        super(points);
    }

    public void perimeter (){
        int perimeter=0;
        perimeter=(cathetusFirst+cathetusSecond+hypotenuse);
        System.out.println("Perimeter Triangle: "+perimeter);
    }

    public void square (){
        int square=0;
        square=(poluperimeter*radius);
        System.out.println("Square Triangle - " +square);
    }

    public String toString (){
        return ("Triangle" + Arrays.deepToString(getPoints()));
    }

}
