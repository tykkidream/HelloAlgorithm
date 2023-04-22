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

        // 比较 45 次， 移动 29 次。
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
                if (data[j] < data[k]) {
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
