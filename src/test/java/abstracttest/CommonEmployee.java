package abstracttest;

/**
 * @author nietingting
 * Created on 2022-07-24
 */
public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"工作中");


    }
}
