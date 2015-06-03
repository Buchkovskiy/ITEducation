package ITEducation.homework_week2;

import java.util.Arrays;

/**
 * Created by Администратор on 25.05.2015.
 */
public class Circle extends Shape {
    Point centre;
    int radius;

    public Circle(Point [] points, Point centre, int radius) {
        super(points);
        this.centre = centre;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public String toString (){
        System.out.print("Circle: ");
        return ("Centre: " + getCentre()
                + ", Radius = " + getRadius()
        );
    }

    @Override
    public void perimeter() {
        int perimeter= (int) (2*Math.PI*getRadius());
        System.out.println("Perimeter Circle: "+perimeter);
    }

    @Override
    public void square (){
        double square=(Math.PI*Math.pow(this.getRadius(),2));//S=π*r2
        System.out.println("Square Circle - " +square);
    }


}
