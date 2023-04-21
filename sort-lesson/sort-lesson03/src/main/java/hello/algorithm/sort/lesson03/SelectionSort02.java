package hello.algorithm.sort.lesson03;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 选择排序
 */
public class SelectionSort02 {
    public static void main(String[] args) {

        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        selectSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static void selectSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int j = i, k = j + 1;
            for (; k < data.length; k++) {
                if (data[j] > data[k]) {
                    j = k;
                }
            }

            int temp = data[j];
            data[j] = data[i];
            data[i] = temp;
        }
    }
}
