package hello.algorithm.sort.lesson03;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 选择排序
 */
public class SelectionSort04 {
    public static void main(String[] args) {

        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        selectSort(data);
    }

    private static void selectSort(int[] data) {
        int count = 0;

        for (int i = 0; i < data.length - 1; i++) {
            int j = i, k = j + 1;
            for (; k < data.length; k++) {
                if (data[j] > data[k]) {
                    j = k;
                }
                count++;
            }

            int temp = data[j];
            data[j] = data[i];
            data[i] = temp;


            System.out.println("count : " + count +"\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));
        }
    }
}
