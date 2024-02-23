import java.util.*;

class Student {
    String name;
    int korean;
    int english;
    int math;
    
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            int korean = scanner.nextInt();
            int english = scanner.nextInt();
            int math = scanner.nextInt();
            students.add(new Student(name, korean, english, math));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.korean != s2.korean) {
                    return s2.korean - s1.korean; 
                } else if (s1.english != s2.english) {
                    return s1.english - s2.english; 
                } else if (s1.math != s2.math) {
                    return s2.math - s1.math;
                } else {
                    return s1.name.compareTo(s2.name); 
                }
            }
        });

        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}
