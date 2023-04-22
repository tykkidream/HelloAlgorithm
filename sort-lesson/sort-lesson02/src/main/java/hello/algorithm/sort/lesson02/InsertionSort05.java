package hello.algorithm.sort.lesson02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 插入排序—直接插入排序
 * Created by Tykkidream on 2017/10/17.
 */
public class InsertionSort05 {

    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        insertSort(data);

        // 比较 35 次， 移动 29 次。
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

                // 倒序排序
                if (data[j] < data[k]) {
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
    }
}
