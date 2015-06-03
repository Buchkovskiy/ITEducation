package ITEducation.homework_week4;

/**
 * Created by Администратор on 04.06.2015.
 */
public class Student extends  Man{
    private Group group;
    private static int size;

    public Student(Group group) {
        this.group = group;
    }

    public Student(String name, int height, int weight, char sex, int age, Group group) {
        super(name, height, weight, sex, age);
        this.group = group;
        this.size++;
    }

    public static int getSize() {
        return size;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void show (){
        System.out.println(" Name  |   Height   |  Weight  |   Sex  |   Age   |  Group |\n"
                +" "+getName()+"      "+getHeight()+"         "+getWeight()+"         "+getSex()+"       "+getAge()+"       "+getGroup().getName());
    }

    public String toString (){
        return ("  Name  "+getName());
    }
}
