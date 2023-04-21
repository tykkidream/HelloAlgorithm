package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序
 * Created by Tykkidream on 2017/10/17.
 */
public class BubbleSort05 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        bubbleSort(data);
    }

    public static void bubbleSort(int[] data){
        int count = 0;

        for (int i = data.length; i > 1; i--) {
            int j = 0, k = 1;
            for (; k < i; j = k, k++) {
                if (data[j] < data[k]) {
                    int temp = data[j];
                    data[j] = data[k];
                    data[k] = temp;
                }
                count++;
            }
            System.out.println("count : " + count +"\tj : " + j + "\tk : " + k + "\t i : "+ i+ "\t" + JSON.toJSONString(data, SerializerFeature.PrettyFormat));
        }
    }
}
