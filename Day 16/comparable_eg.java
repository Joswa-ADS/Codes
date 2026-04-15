
import java.util.*;

class  Student implements Comparable<Student>{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student s){
        return this.marks - s.marks; //ascending order
        //return s.marks - this.marks; //descending order
    }
    @Override
    public String toString(){
        return this.name + "-" + this.marks;
    }
}
public class Comparable_eg {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 85));
        list.add(new Student("Bob", 90));
        list.add(new Student("Charlie", 80));
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name + " " + s.marks);
        }
    }
}