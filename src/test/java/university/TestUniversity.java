package university;
/**
 * Created by souptalla on 12/02/2017.
 */
public class TestUniversity {
    public static void main(String[] args) {
        Level l1 = new Level();
        Student arnaud = new Student("arnaud");
        Student cedric = new Student("cedric");
        Course math = new Course("math",90);
        Course english = new Course("english",80);
        l1.addStudent(arnaud);
        l1.addStudent(cedric);

        arnaud.takeCourse(math);
        arnaud.takeCourse(english);

        cedric.takeCourse(math);
        cedric.takeCourse(english);

        cedric.setStudentName("cedric");
        arnaud.setStudentName("arnaud");

        arnaud.setstudentGrade(math,90);
        arnaud.setstudentGrade(english,10);

        cedric.setstudentGrade(math,70);
        cedric.setstudentGrade(english,5);

        System.out.println(l1.findBestStudent().getStudentName() + " : " + l1.findBestStudent().getstudentGrade() );
        System.out.println(l1.findWorseStudent().getStudentName() +" : " +  l1.findBestStudent().getstudentGrade() );

    }
}
