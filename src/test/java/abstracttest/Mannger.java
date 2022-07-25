package abstracttest;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-07-24
 */
public class Mannger extends Employee{
    private double bonus;

    // 点击构造器自动创建

    public Mannger(String name, int id, double salary) {
        super(name, id, salary);
    }

    //提供set/get方法

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 打work 就会自动重写
    @Override
    public void work() {
        System.out.println("经理"+getName()+"工作中");

    }
}
