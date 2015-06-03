package ITEducation.homework_week4;

import java.util.Scanner;

/**
 * Created by Администратор on 04.06.2015.
 */
public class Group {
    private Student [] group;
    private String name;

    public Group (String name){

    }

    public Group(Student[] group, String name) {
        this.group = group;
        this.name = name;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString (){
        return (" Name  |   SizeGroup \n"+ "  "+getName()+"       "+Student.getSize());
    }

    public boolean findStudent (){
        Scanner sc = new Scanner (System.in);
        boolean findStudent=false;
        System.out.println("Input Name wanted student:");
        String findSecondName = sc.nextLine();
        for (int i = 0; i <getGroup().length; i++) {
            if (getGroup()[i].getName().equals(findSecondName)){
                findStudent=true;
            }

        }
        return findStudent;
    }
}
