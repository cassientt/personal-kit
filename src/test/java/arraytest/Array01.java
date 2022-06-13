package arraytest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class Array01 {
    public static void main(String[] args) {
        // double[] :double类型的数组；数组名字是hens
        double[] hens = {1, 3.0, 5, 6, 7, 8.9};

        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            totalWeight += hens[i];
            System.out.println("第" +
                    (i + 1) + "个元素的值=" + hens[i]);

        }
        System.out.println("总体重=" + totalWeight + "平均体重="
                + (totalWeight / hens.length));

    }


}
