import java.util.*;

public class Main {
    public static void main(String[] args) {
    /*    Random random =new Random();
        List<Integer>integers =new LinkedList<>();
        Set<Integer>integers1 =new HashSet<>();

        for (int i = 0; i < 400; i++) {
            integers.add(random.nextInt(20));
        }
        integers1.addAll(integers);

        int sum = 0;
        for (Integer integer : integers) {
//            System.out.println(integer);
            sum= sum+integer;
        }
        int sum1 = 0;
        for (Integer integer : integers1) {
//            System.out.println(integer);
            sum1 = sum1+integer;
        }

        System.out.println("LinkedList summasy");
        System.out.println(integers);
        System.out.println(sum);
        System.out.println("HashSet summay ");
        System.out.println(integers1);
        System.out.println(sum1);

     */
        Student student1 =new Student(1,"Bakyt",23);
        Student student2 = new Student(4,"Bakyt",23);
        Student student3 =new Student(3,"Bakyt",23);
        Student student4 =new Student(2,"Bakyt",23);
        Student student5 =new Student(5,"Bakyt",23);

        Set<Student>students=new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);
        Set<Student>students1=new LinkedHashSet<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        System.out.println(students1);
        Set<Student>students2=new TreeSet<>();
        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        students2.add(student4);
        students2.add(student5);
        System.out.println(students2);
    }
}