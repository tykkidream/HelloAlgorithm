package hello.algorithm.sort.lesson02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 插入排序—直接插入排序
 * Created by Tykkidream on 2017/10/17.
 */
public class InsertionSort01 {

    public static void insertSort(int a[], int n)
    {
        for(int i= 1; i<n; i++){
            if(a[i] < a[i-1]){               //若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j= i-1;
                int x = a[i];        //复制为哨兵，即存储待排序元素
                a[i] = a[i-1];           //先后移一个元素
                while(x < a[j]){  //查找在有序表的插入位置
                    a[j+1] = a[j];
                    j--;         //元素后移
                }
                a[j+1] = x;      //插入到正确位置
            }
            //print(a,n,i);           //打印每趟排序的结果
        }

    }

    public static void main(String[] args) {
        int[] data = {3,1,5,7,2,4,9,6};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        insertSort(data,8);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }
}
