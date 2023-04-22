package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序的分析
 *
 * - 最好情况、最坏情况、平均情况，及其时间复杂度
 * - 时间复杂度的系数、常数 、低阶
 * - 比较次数和交换（或移动）次数
 *
 */
public class BubbleSort06 {
    public static void main(String[] args) {
        // 最好情况
        int[] bestCase = new int[]{ 1,2,5,5,5,7,8,31,34,62 };
        // 最坏情况
        int[] worstCase = new int[]{ 62,34,31,8,7,5,5,5,2,1 };

        bubbleSort(bestCase);
        bubbleSort(worstCase);

        // 最好情况比较 9 次， 也就是 n-1 次，移动 0 次。
        // 最坏情况比较 45 次， 也就是 (n^2-n)/2 次，移动 0 次。

    }

    public static void bubbleSort(int[] data){
        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;

        for (int i = data.length; i > 1; i--) {
            int j = 0, k = 1;
            boolean has = false;
            for (; k < i; j = k, k++) {
                if (data[j] > data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                    has = true;
                    moveCount++;
                }
                compareCount++;
            }
            System.out.println("compareCount : " + compareCount + "\tmoveCount : " + moveCount + "\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));

            if (!has) {
                break;
            }
        }

        System.out.println("====================================================================================");
    }
}
