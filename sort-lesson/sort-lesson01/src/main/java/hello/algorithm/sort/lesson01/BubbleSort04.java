package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序
 * Created by Tykkidream on 2017/10/17.
 */
public class BubbleSort04 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        bubbleSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    public static void bubbleSort(int[] data){

        for (int i = data.length; i > 1; i--) {
            for (int j = 0, k = 1; k < i; j = k, k++) {
                // 从大到小排序
                if (data[j] < data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                }
            }
        }

    }
}
