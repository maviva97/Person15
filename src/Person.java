import java.util.Objects;
public class Person implements Comparable<Person>{

    private String name;
    private int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public  String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object obj){
        if (!( obj instanceof  Person)) return  false;
        Person otherPerson=(Person) obj;
        return  this.name==otherPerson.name&this.age==otherPerson.age;
    }
    public  int hashCode(){
        return Objects.hash();
    }
    public  int compareTo(Person b){
       if(age>b.age){
           return 1;}
       else if (age<b.age){
           return -1;}
       else {
           return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
