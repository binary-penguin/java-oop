import java.util.ArrayList;

public class OOPClasses {
    public static void main(String[] args) {
        // CLASS = attributes + methods

        Student Jorge = new Student("Jorge", 14, "Ceboruco");
        System.out.println(Jorge.toString());

        //////////////// A. Encapsulation
        // Do not need to import classes if they in the same dir

        // A.1 ACCESS MODIFIERS
        // Using access modifiers as prefix (public, private, protected)
        // Use getters and setters

        // A.2 OVERLOADING - Same method different args
        // think of println()
        // just add new method

        // A.3 ENUMERATOR - ...

        // A.4 CONSTRURCTOR
        // public method with same name as class
        // you can overload a constructor as well

        // A.5 OVERRIDES
        // Replace existing method from parent class
        // Good practice add tag @Override to indicate it
        // Some useful to override are toString/equals

        // A.6 Generic Lists (since actually objects can be seen as datatypes)
        // We can create a container for them
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(Jorge);
        students.get(0);

        // A.7 Static properties
        // Static means no need to instantiate, you can access directly and modify
        // directly
        Student.school = "Tec de Monterrey";
        System.out.println(Student.school);

        // A.8 Static methods
        // Use static prefix, cannot use this cause this implies instance

        /////////////// B. Inheritance
        // WE say A IS B
        // PrepaStudent IS Student
        PrepaStudent Charly = new PrepaStudent("Charly", 23, "Ceboruco");
        System.out.println(Charly.getName());

        ////////////// C. POLYMORPHISM
        //// C.2 Generic List Student
        /// Our generic Student list could contain PrepaStudent and ProfeStudent
        // Since they extend from the same type Student

        /// C.3 Students behave different
        /// So they override a method and when you called each of them
        /// they act differently even though is the same method

        //// C.1 Abstract
        /// In the ideal scenario a Student could be a PrepaStudent
        /// or a ProfeStudent so Student per se should not exist
        /// is like a general concept and not a concrete example,
        /// so add abstract as next to class, and java will avoid instances directly


    }
}
