package hello.algorithm.sort.lesson02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 插入排序—直接插入排序
 * Created by Tykkidream on 2017/10/17.
 */
public class InsertionSort03 {

    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        insertSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i - 1, k = i; j > -1; k = j, j--) {
                if (data[j] > data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
