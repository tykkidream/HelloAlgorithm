package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 这个是极客时间里，作者给出的写法
 */
public class BubbleSort07 {

    public static void main(String[] args) {
        // 最好情况
        int[] bestCase = new int[]{ 1,2,5,5,5,7,8,31,34,62 };
        // 最坏情况
        int[] worstCase = new int[]{ 62,34,31,8,7,5,5,5,2,1 };

        bubbleSort(bestCase);
        bubbleSort(worstCase);

        // 最好情况 9 次， 也就是 n-1 次
        // 最坏情况 45 次， 也就是 (n^2-n)/2 次

    }

    public static void bubbleSort(int[] data){
        if (data.length <= 1) {
            return;
        }

        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;

        for (int i = 0; i < data.length; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;

            int j = 0;
            for (; j < data.length - i - 1; ++j) {
                if (data[j] > data[j+1]) { // 交换
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                    flag = true;  // 表示发生了数据交换
                    moveCount++;
                }

                compareCount++;
            }

            System.out.println("compareCount : " + compareCount + "\tmoveCount : " + moveCount + "\tflag : " + convert(flag) + "\tj : " + j + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));

            if (!flag) {
                break;  // 没发生数据交换，提前退出
            }
        }

        System.out.println("========================================================================================");
    }

    private static String convert(boolean bool) {
        return bool ? "Yes" : "No";
    }

}
