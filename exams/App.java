package exams;

public class App {
    public static void main(String[] args) {
        Student[] listStudents = new Student[5];
        for (int num_students = 0; num_students < listStudents.length; num_students++)
            listStudents[num_students] = new Student();
        int[] results = new int[5];
        for (int mark = 0; mark < 5; mark++) {
            results[mark] = 1 + (int) (Math.random() * 5);
            System.out.print(results[mark]);
        }
        int medium;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += results[i];
        }
        medium = total / results.length;
        System.out.println("Cредняя оценка: " + medium);
    }

    public static class Student {
        public String name;
        public String lastName;
    }
}
