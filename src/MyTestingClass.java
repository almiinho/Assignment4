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
        return "MyTestingClass{" + "id=" + id + "}";
    }

    @Override //  Generate unique hash codes for objects
    public int hashCode() {
        int res = 14;
        res = 31 * res + id;
        return res;
    }


    @Override// Compare objects  based on their id
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return id == that.id;
    }


}
