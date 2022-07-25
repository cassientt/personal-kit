package AbstractTemplate;

/**
 * @author nietingting
 * Created on 2022-07-24
 */
abstract public class Template { // 抽象类-模版设计模式

    public abstract void job();

    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end= System.currentTimeMillis();
        System.out.println("执行时间"+(end-start));
    }


}
