
/*
in simple points
Comparator:
 - external interface
 - logic: create a separate class that implements Comparator interface and override compare method
*/
import java.util.*;

class Stud {
    int id;
    String name;
    int mark;
    Stud(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.mark;
    }
}
public class Comparator_eg {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(1, "Alice", 85));
        studs.add(new Stud(2, "Carly", 90));
        studs.add(new Stud(3, "Carrie", 80));
        studs.add(new Stud(4, "David", 95));
        studs.add(new Stud(5, "Taylor", 88));
        Comparator<Stud> byid=new Comparator<Stud>() {
            public int compare(Stud s1, Stud s2){
                return s2.id - s1.id; 
            }
        };
        Collections.sort(studs, byid);
        System.out.println("By id: "+studs);

        Comparator<Stud> byname=new Comparator<Stud>() {
            public int compare(Stud s1, Stud s2){
                return s1.name.compareTo(s2.name); 
            }
        };
        Collections.sort(studs, byname);
        System.out.println("By name: "+studs);

        Comparator<Stud> bymark=new Comparator<Stud>() {
            public int compare(Stud s1, Stud s2){
                return s1.mark - s2.mark; 
            }
        };
        Collections.sort(studs, bymark);
        System.out.println("By mark: "+studs);
    }
}