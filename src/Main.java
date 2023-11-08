import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> set = new TreeSet<Person>();
        Person p1 = new Person("Ion", 25);
        Person p2 = new Person("Stela", 45);
        Person p3 = new Person("Ion", 35);
        Person p4 = new Person("Faina", 65);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        boolean f = false;
        for (Person b : set) {
            if (b.getAge() > 60) {
                f = true;
                System.out.println(b.getName() + " " + b.getAge());
            }
         if (f=false) System.out.println("Nu sunt persoane cu varsta mai mare de 60 ani");
            }
        }
    }