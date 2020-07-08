package testCollection;




/*Write a class named Employee with fields name,age,salary,joiningDate Write comparable
 to compare with age and Write comparators for all 
other fields(5)*/

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private long salary;
    private int joiningdate;
    
    public int joiningdate() {
        return joiningdate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.joiningdate = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp) {
     
        return (this.age - emp.age);
    }

    public String toString() {
        return "[age=" + this.age + ", name=" + this.name + ", joiningdate=" 
    + this.joiningdate + ", salary=" + this.salary + "]";
    }

	

}