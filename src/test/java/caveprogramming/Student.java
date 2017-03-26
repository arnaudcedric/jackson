package caveprogramming;

/**
 * Created by souptalla on 25/02/2017.
 */
// learning Static
public class Student {

    public String name;
    public int id;

    public static int counter =0;

    public Student(){
        counter++;
    }

    public static void main(String[] args){


        System.out.println("before : " + Student.counter);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="arnaud";
        s1.id= 8;
        s2.name="cedric";
        s2.id=7;

        System.out.println("after : " + Student.counter);


    }

}
