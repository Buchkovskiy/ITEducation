package ITEducation;
import ITEducation.Massiv;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 16.05.2015
 * Time: 14:28:43
 * To change this template use File | Settings | File Templates.
 */
public class TestArray {
    public static void main (String [] arg){
        int[]mas;
        mas= Massiv.arrayHelper(10);
        Massiv.sortArray(mas);
        Massiv.betwin(mas);
        Massiv.moda(mas);
        Massiv.meridian(mas);
    }

}
