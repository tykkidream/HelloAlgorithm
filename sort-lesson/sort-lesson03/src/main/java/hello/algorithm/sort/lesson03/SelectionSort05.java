package hello.algorithm.sort.lesson03;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 选择排序
 */
public class SelectionSort05 {
    public static void main(String[] args) {
        // 最好情况
        int[] bestCase = new int[]{ 1,2,5,5,5,7,8,31,34,62 };
        // 最坏情况
        int[] worstCase = new int[]{ 62,34,31,8,7,5,5,5,2,1 };

        selectSort(bestCase);
        selectSort(worstCase);

        // 最好情况比较 45 次， 也就是 n-1 次，移动 0 次。
        // 最坏情况比较 45 次， 也就是 (n^2-n)/2 次，移动 6 次。

    }

    private static void selectSort(int[] data) {
        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;

        for (int i = 0; i < data.length - 1; i++) {
            int j = i, k = j + 1;
            for (; k < data.length; k++) {
                if (data[j] > data[k]) {
                    j = k;
                }
                compareCount++;
            }

            if (j > i) {
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
                moveCount++;
            }

            System.out.println("compareCount : " + compareCount + "\tmoveCount : " + moveCount + "\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));
        }

        System.out.println("====================================================================================");
    }
}
