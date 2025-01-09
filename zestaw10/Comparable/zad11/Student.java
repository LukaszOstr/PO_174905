package zestaw10.Comparable.zad11;


import java.util.Arrays;


public class Student implements Comparable<Student>{
    String name;
    double averageGrade;
    int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "{" +
                " " + name + '\'' +
                ", " + averageGrade +
                ", " + yearOfStudy +
                " }";
    }

    @Override
    public int compareTo(Student o) {

        if(Double.compare(this.averageGrade,o.averageGrade) == 0){
            return this.yearOfStudy - o.yearOfStudy;
        }

        else{
            return -Double.compare(this.averageGrade,o.averageGrade);
        }



    }

    public static void main(String[] args) {
        Student[] tablica = {
                new Student("a",5.92,2010),
                new Student("b",4.12,2008),
                new Student("c",3.22,2009),
                new Student("d",4.12,2004)
        };

        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));


    }



}
