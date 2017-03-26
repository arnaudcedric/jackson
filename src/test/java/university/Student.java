package university;

/**
 * Created by souptalla on 12/02/2017.
 */
public class Student {

    private String studentName;
    private int studentGrade;
    private int add;

    Course[] courses = new Course[2];
    Student(String studentName){
        this.studentName=studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setstudentGrade(Course course,int studentGrade){
        this.studentGrade=studentGrade;
    }
    public int getstudentGrade(){
        return studentGrade;
    }

    public void takeCourse(Course course){
        courses[add] = course;
        add++;
        ///
    }

    public String getBestStudent(){

        return studentName;
    }

    public int getAverageScore(){
        int total=0;
        for (int i = 0; i <courses.length; i++) {
            total=total+courses[i].getCourseGrade();

        }
        return total/courses.length;
    }

}
