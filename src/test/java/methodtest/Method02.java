package methodtest;

/**
 * @author nietingting
 * Created on 2022-06-12
 */
public class Method02 {
    public static void main(String[] args) {
        // 遍历数组，输出数组的各个元素
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
//
//        for (int i= 0;i< map.length;i++){
//            for (int j= 0;j< map.length;j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
        MyTools tool = new MyTools();

        tool.printArr(map);
        tool.printArr(map);


    }

}


// 把输出的功能，写到类方法中，然后调用
class MyTools{

    public void printArr(int[][]map){
        //对传入的数组遍历
        for (int i= 0;i< map.length;i++){
            for (int j= 0;j< map.length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

}