package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BubbleSort06 {
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
        int count = 0;

        for (int i = data.length; i > 1; i--) {
            int j = 0, k = 1;
            boolean has = false;
            for (; k < i; j = k, k++) {
                if (data[j] > data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                    has = true;
                }
                count++;
            }
            System.out.println("count : " + count +"\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));

            if (!has) {
                break;
            }
        }

        System.out.println("============================================================");
    }
}
