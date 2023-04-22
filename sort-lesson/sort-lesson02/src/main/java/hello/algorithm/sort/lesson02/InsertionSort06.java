package hello.algorithm.sort.lesson02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 插入排序—直接插入排序
 * Created by Tykkidream on 2017/10/17.
 */
public class InsertionSort06 {

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
        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;

        for (int i = 1; i < data.length; i++) {
            int j = i - 1, k = i;
            for (; j > -1; k = j, j--) {
                compareCount++;

                // 正序排序
                if (data[j] > data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                    moveCount++;
                } else {
                    break;
                }
            }

            System.out.println("compareCount : " + compareCount + "\tmoveCount : " + moveCount + "\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));
        }

        System.out.println("====================================================================================");
    }
}
