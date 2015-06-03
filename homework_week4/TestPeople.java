package ITEducation.homework_week4;

/**
 * Created by Администратор on 04.06.2015.
 */
public class TestPeople {
    public static void main(String[] args) {

        Student[] studentsTV41 = new Student[3];
        Group TV41=new Group(studentsTV41,"TV-41");
        for (int i = 0; i <studentsTV41.length ; i++) {
             studentsTV41[i]=null;
        }
        Man man1=new Man("Sergey", 175, 65, 'm', 28);
        studentsTV41[0]=new Student("Sergey", 175, 65, 'm', 29, TV41);
        studentsTV41[1]=new Student("Vasya", 183, 76, 'm', 30, TV41);
        studentsTV41[2]=new Student("Olya", 165, 55, 'w', 29, TV41);

        man1.show(); // method Man.show
        studentsTV41[0].show(); // method Student.show

        System.out.println(TV41);//toString Group
        boolean b = TV41.findStudent();//Find Student
        System.out.println(b);
    }
}
