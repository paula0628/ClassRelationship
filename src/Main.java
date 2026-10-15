
public class Main
{
    public static void main(String[] args)
    {
        Course c1=new Course("Java");
        Student s1=new Student(100318394, c1, "Lance");

        Student s2=new Student(100317843, c1, "Lynn");
        Student s3=new Student(100314293, c1,"Bobby");

        Faculty f1=new Faculty();

        s1.displayInfo();
        f1.advisee[0] = s1;
        f1.advisee[1] = s2;
        f1.advisee[2] = s3;

    }
}