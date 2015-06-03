package ITEducation.homework_week4;

/**
 * Created by Администратор on 04.06.2015.
 */
public class Man {
    private int height;
    private int weight;
    private String name;
    private char sex;
    private int age;

    public Man (){}

    public Man(String name, int height, int weight,  char sex, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void show (){
        System.out.println(" Name  |   Height   |  Weight  |   Sex  |   Age   |\n"
                +" "+getName()+"      "+getHeight()+"         "+getWeight()+"         "+getSex()+"       "+getAge());
    }

    public String toString (){
        return ("  Name  "+getName());
    }
}
