package basics;

import java.util.ArrayList;

public class Student {
    public static final int course_limit = 3;
    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    private String name;
    private String gender;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    ArrayList<Course> enrolled = new ArrayList<Course>();
    public void enroll(Course course){
        if(course_limit<enrolled.size()){
            enrolled.add(course);
        }

        printEnrollCourse();
    }

    public void printEnrollCourse(){
        for( Course course :enrolled){
            if(course.getDept()!=null){
                System.out.println("Course :"+course.getName()+","+"Department:"+course.getDept().getName()+","+":");
            }
        }
    }

    public ArrayList<Course> getCourselist(){
        return enrolled;
    }
    

}
