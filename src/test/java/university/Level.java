package university;
/**
 * Created by souptalla on 12/02/2017.
 */
public class Level {
//    private String levelName;
    Student[] students = new Student[2];
    Course[] courses = new Course[2];
    private int add;

    public void addStudent(Student student){

        students[add]=student;
        add++;

    }
    public Student findBestStudent(){

        Student bestStudent = null;

        for (int i = 0; i < students.length ; i++) {
            if (bestStudent == null){
                bestStudent = students[i];
            }else if (bestStudent.getAverageScore() < students[i].getAverageScore()){
                bestStudent = students[i];
            }
        }

        return bestStudent;
    }

    public Student findWorseStudent(){
        Student worseStudent = null;
        for (int i = 0; i <students.length ; i++) {
            if (worseStudent==null){
                worseStudent=students[i];
            }else if (worseStudent.getAverageScore() > students[i].getAverageScore()){
                worseStudent=students[i];
            }
        }
        return worseStudent;
    }

    public int findStudentGrade(){

        int counter=0;
        for (int i = 0; i <courses.length; i++) {
            courses[counter].getCourseGrade();
            counter++;
        }
        return students[counter].getstudentGrade();

    }
}




