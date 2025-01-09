package zestaw10.Comparable.zad1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student implements Comparable<Student>{

    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Student other) {
        return - Double.compare(this.averageGrade, other.averageGrade);
    }

    @Override
    public String toString() {
        return '{' + name  +
                ", " + averageGrade +
                ", " + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Student a = new Student("a",4.12,2004);
        Student b = new Student("b",4.93,2004);
        Student c = new Student("c",2.12,2004);
        Student d = new Student("d",4.12,2004);
        Student f = new Student("e",3.82,2004);

        Student[] lista1 = {a,b,c,d,f};
        Arrays.sort(lista1);
        System.out.println(Arrays.toString(lista1));

        ArrayList<Student> lista2 = new ArrayList<>();
        lista2.add(a);
        lista2.add(b);
        lista2.add(c);
        lista2.add(d);
        lista2.add(f);

        Collections.sort(lista2);
        System.out.println(lista2);




    }

}
