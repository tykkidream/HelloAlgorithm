package hello.algorithm.sort.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 冒泡排序
 * Created by Tykkidream on 2017/10/17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        bubbleSort(data, data.length);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    public static void bubbleSort(int a[], int n){
        for(int i =0 ; i< n-1; ++i) {
            for(int j = 0; j < n-i-1; ++j) {
                if(a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
}
