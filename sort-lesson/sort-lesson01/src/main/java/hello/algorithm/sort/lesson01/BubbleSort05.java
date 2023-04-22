package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序的分析
 *
 * - 比较次数和交换（或移动）次数
 *
 * Created by Tykkidream on 2017/10/17.
 */
public class BubbleSort05 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        bubbleSort(data);

        // 比较 35 次， 移动 13 次。

        // 初始有序元素对：
        // (5,7),(5,8),(5,5),(5,62),(5,31),(5,5),(5,34),
        // (2,7),(2,8),(2,5),(2,62),(2,31),(2,5),(2,34),
        // (7,8),(7,62),(7,31),(7,34),
        // (8,62),(8,31),(8,34),
        // (1,5),(1,62),(1,31),(1,5),(1,34),
        // (5,62),(5,31),(5,5),(5,34),
        // (31,34)
        // (5,34)
        // 一共 32 对
        // 满有序度： n*(n-1)/2 = 10 * ( 10 - 1) / 2 = 45
        // 逆有序度： 满有序度 - 初始有序度 = 45 - 32 = 13，也就是需要移动 13 次

        // 平均时间复杂度： n*(n-1)/2/2 = 12.5
    }

    public static void bubbleSort(int[] data){
        // 比较次数
        int compareCount = 0;
        // 移动次数
        int moveCount = 0;

        for (int i = data.length; i > 1; i--) {
            boolean has = false;
            int j = 0, k = 1;
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
    }
}
