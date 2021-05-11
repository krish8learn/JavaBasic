package basics;

public class Course {
    private String Cname;
    private int Cid;
    private Department dept;

    public Course(String name, int id, String dept){
        this.Cname = name;
        this.Cid = id;
        if(dept != null){
            this.dept = new Department(dept);
        }
    }

    public void setName(String name, int id){
        this.Cname = name;
        this.Cid = id;
    }
    public void setId(int id){
        this.Cid = id;
    }

    public String getName(){
        return Cname;
    }
    public int getId(){
        return Cid;
    }
    public Department getDept(){
        return dept;
    }
}
