package M2.HW;

public class main {
    public static void main(String[] args) {
        //membuat beberapa mahasiswa
        Student student1 = new Student("STU001", "Ali");
        Student student2 = new Student("STU002", "Bobi");
        Student student3 = new Student("Stu002","aoa");
        
        //Mendaftarkan mahasiswa ke materi
        student1.enrollSubject("Matematika");
        student2.enrollSubject("Fisika");

        //Menampilkan infrmasi mahasiswa
        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
    }
}
