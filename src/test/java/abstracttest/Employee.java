package abstracttest;

/**
 * @author nietingting
 * Created on 2022-07-24
 */
abstract class Employee {
    private String name;
    private int id;
    private double salary;

    // 构造器
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //提供抽象方法
    public abstract void work();

    // 提供set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


