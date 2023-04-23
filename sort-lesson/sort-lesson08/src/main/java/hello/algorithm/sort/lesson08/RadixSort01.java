package hello.algorithm.sort.lesson08;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.LinkedList;
import java.util.List;

/**
 * 根据自己的理解，第一版，正序
 */
public class RadixSort01 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        radixSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static void radixSort(int[] data) {

        int[][] buckets = new int[10][10];

        boolean flag = true;

        for (int b1 = 10, b2 = 1; flag; b2 = b1, b1 = b1 * 10) {
            flag = false;

            for (int d : data) {
                int bit = d % b1 / b2;

                int[] bucket = buckets[bit];

                for (int i = 0; true; i++) {
                    if (bucket[i] == 0) {
                        bucket[i] = d;
                        break;
                    }
                }

                if (!flag && d >= b1) {
                    flag = true;
                }
            }

            for (int i = 0, j = 0; i < buckets.length; i++) {
                int[] bucket = buckets[i];

                for (int k = 0; k < bucket.length && bucket[k] > 0; k++, j++) {
                    data[j] = bucket[k];
                    bucket[k] = 0;
                }
            }
        }

    }


}
