package basics;

public class Department {
    private String Dname;

    public Department(String name){
        this.Dname = name;
    }

    public void setName(String name){
        this.Dname = name;
    }

    public String getName(){
        return Dname;
    }
}
