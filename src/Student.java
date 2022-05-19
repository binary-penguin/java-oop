public class Student {
    private String name;
    private int age;
    private String address;
    static String school;

    public Student() {
        this.name = "Juanito";
        this.age = 32;
        this.address = "Las Palomas";
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override // means it modifies supper default method
    public String toString() {
        return this.name + " " + this.age + " " + this.address;
    }

    public static String getSchool() {
        return school; // do not use this
    }
}