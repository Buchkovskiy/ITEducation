package ITEducation.homework_week2;

/**
 * Created by Администратор on 25.05.2015.
 */
public abstract class Shape {
    protected Point[]points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public abstract void perimeter ();

    public abstract void square ();

    //polymorphism java
    public final void  show (Shape shape){
        System.out.println("Test Polymorphism. This method got shape - "+shape.getClass().getSimpleName());
    }
}
