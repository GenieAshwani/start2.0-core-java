package CollectionDemo;


import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CollectionP01 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ayush");
        Student s2=new Student(2,"Akash");
        Student s3=new Student(3,"piyush");
        Student s4=new Student(4,"rani");

        //IO RI Dup
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        System.out.println(arrayList);

        Student student = arrayList.get(1);
        System.out.println(student);


        ArrayList al=new ArrayList();
        al.add(10);
        al.add("Ashwani");
        al.add(10.5);

        System.out.println(al);

        List<Integer> al1=new ArrayList<>();
        al1.add(10);  //int---->Integer
        al1.add(20); //new Integer(20);----->20
        al1.add(30);
        al1.add(10);
        al1.add(50);
        System.out.println(al1);


        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println(set);

        for(Integer d:set)
        {
            System.out.println(d);
        }

        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);

        System.out.println(map);

        //1 way
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries)
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
