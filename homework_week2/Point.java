package ITEducation.homework_week2;

/**
 * Created by Администратор on 25.05.2015.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString (){
        return ("(" + getX()+","
                 + getY()+")"
        );
    }
}
