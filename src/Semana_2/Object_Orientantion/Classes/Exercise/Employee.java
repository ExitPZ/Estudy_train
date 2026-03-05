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
        if (salary != null) {
            for (double i : salary) {
                System.out.print("\n salary: $ " + i);
            }

        }
        avaregeSalary();
    }


    public void avaregeSalary() {
        if (salary == null) return;

        double avarege = 0;

        for (double i : salary) {
            avarege += i;
        }
        avarege /= salary.length;
        System.out.println("\nAvarege Salary: " + avarege);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }
}
