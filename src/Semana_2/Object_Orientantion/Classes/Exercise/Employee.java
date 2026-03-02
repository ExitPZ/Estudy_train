package Semana_2.Object_Orientantion.Classes.Exercise;

public class Employee {
    int age;
    String name;
    double[] salary;

    public Employee(int age, String name, double[] salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        for (double i : salary) {
            System.out.print("Salary: $ " + i);
        }

        avaregeSalary();
    }


    public void avaregeSalary() {
        double avarege = 0;
        for (double i : salary) {
            avarege += i;
        }
        avarege /= salary.length;
        System.out.println("\nAvarege Salary: " + avarege);
    }
}
