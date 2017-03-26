package university;

/**
 * Created by souptalla on 12/02/2017.
 */
public class Course {

    private String courseName;
    private int courseGrade;

    Course(String courseName, int courseGrade){
        this.courseName=courseName;
        this.courseGrade=courseGrade;
    }
    Course(){

    }

    int getCourseGrade(){
       return courseGrade;
    }
//    void setCourseGrade(int courseGrade){
//        this.courseGrade = courseGrade;
//    }
//
//    void setCourseName(String courseName){
//        this.courseName=courseName;
//    }

    String getCourseName(){
        return courseName;
    }

}
