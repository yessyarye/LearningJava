package M2.HW;

public class Student {
        //atribut untuk class Student
        private String studentID;
        private String name;
        private String enrolledSubject;
    
        //constructor untuk menginisialisasi atribut student dan mengatur enrolledSubject sebagai String
        public Student(String studentID, String name){
            this.studentID = studentID;
            this.name = name;
            this.enrolledSubject = "";
        }
    
        //method, untuk mendaftarkan mahasiswa ke materi dan menampilkan bahwa mahasiswa telah mendaftar materi
        public void enrollSubject(String subject){
            this.enrolledSubject = subject;
            System.out.println(name + " telah mendaftar ke materi: " + subject);
        }
    
        //untuk return infromasi mahasiswa dan materinya
        public String getStudentInfo(){
            String subjectInfo = (enrolledSubject.isEmpty()) ? "No subject enrolled" : enrolledSubject;
            return "ID Mahasiswa: "+ studentID + "\nNama: " + name + "\nMateri: " + subjectInfo;
        }
    }