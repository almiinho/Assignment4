public class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override //  Return string representation of the object
    public String toString() {
        return "MyTestingClass{" +
                "id=" + id +
                '}';
    }


}
