package hello.algorithm.sort.lesson07;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 根据自己的理解，第一版，正序
 */
public class CountingSort01 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        data = countingSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static int[] countingSort(int[] data) {
        int[] temp = new int[101];

        for (int d : data) {
            temp[d]++;
        }

        for (int i = 0, j = 1; j < temp.length; i = j, j++) {
            temp[j] = temp[i] + temp[j];
        }

        int[] result = new int[data.length];

        for (int d : data) {
            int a = temp[d];

            result[a - 1] = d;

            temp[d] = a - 1;
        }

        return result;
    }


}
