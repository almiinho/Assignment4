public class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }// Getter method for the name field


    public void setName(String name) {
        this.name = name;
    } // Setter method for the name field


    public int getId() {
        return id;
    }// Getter method for the id field


    public void setId(int id) {
        this.id = id;
    }// Setter method for the id field
}
