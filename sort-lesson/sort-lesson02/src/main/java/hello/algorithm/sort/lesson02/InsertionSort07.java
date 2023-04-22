package hello.algorithm.sort.lesson02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 插入排序—直接插入排序
 * Created by Tykkidream on 2017/10/17.
 */
public class InsertionSort07 {

    public static void main(String[] args) {
        // 最好情况
        int[] bestCase = new int[]{ 1,2,5,5,5,7,8,31,34,62 };
        // 最坏情况
        int[] worstCase = new int[]{ 62,34,31,8,7,5,5,5,2,1 };

        insertSort(bestCase);
        insertSort(worstCase);

        // 最好情况比较 9 次， 也就是 n-1 次，移动 0 次。
        // 最坏情况比较 44 次， 也就是 (n^2-n)/2 次，移动 42 次。
    }

    public static void insertSort(int[] data) {
        if (data.length <= 1) {
            return;
        }

        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;


        for (int i = 1; i < data.length; ++i) {
            int value = data[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                compareCount++;

                if (data[j] > value) {
                    data[j+1] = data[j];  // 数据移动
                    moveCount++;
                } else {
                    break;
                }
            }
            data[j+1] = value; // 插入数据

            System.out.println("compareCount : " + compareCount + "\tmoveCount : " + moveCount + "\tj : " + j + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        }



        System.out.println("============================================================================");
    }
}
