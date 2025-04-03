public class student {
    private int id;
    private String name;
    private double gpa;
    private String city;
    private String university;


    public student(int id, String name, double gpa, String city, String university) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.city = city;
        this.university = university;
    }
    //getter and setter


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getUniversity() {
        return university;
    }


    public void setUniversity(String university) {
        this.university = university;
    }
    
}
