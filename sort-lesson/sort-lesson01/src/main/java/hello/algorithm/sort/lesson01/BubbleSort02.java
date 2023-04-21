package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序
 * Created by Tykkidream on 2017/10/17.
 */
public class BubbleSort02 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        bubbleSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    public static void bubbleSort(int[] data){

        for (int i = data.length - 1; i > 0; i--) {
            boolean has = false;
            for (int j = 0; j < i; j++) {
                int a = data[j];
                int b = data[j+1];

                if (a > b) {
                    data[j] = b;
                    data[j+1]  = a;
                    has = true;
                }
            }

            if (!has) {
                break;
            }
        }

    }
}
