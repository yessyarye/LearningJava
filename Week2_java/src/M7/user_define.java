package M7;

import java.util.*;

public class user_define {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan id student: ");
        int id = sc.nextInt();
        System.out.println("Masukkan nama Student: ");
        String nama = sc.next();
        System.out.println("Masukkan id umur: ");
        int umur = sc.nextInt();

        //Creating user-defined class objects
        Student s1 = new Student(id, nama, umur);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanna", 25);
        Student s4 = new Student(105, "Hary", 25);

        //Creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        //Getting iterator
        Iterator<Student> itr = al.iterator();

        while (itr.hasNext()) {
        Student st =(Student)itr.next();
        System.out.println(st.rollno + " " + st.name+ " " + st.age);            
        }
        sc.close();
    }
}


