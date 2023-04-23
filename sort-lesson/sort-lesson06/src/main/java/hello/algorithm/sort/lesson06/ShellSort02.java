package hello.algorithm.sort.lesson06;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 根据自己的理解，第一版，正序
 */
public class ShellSort02 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        shellSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static void shellSort(int[] data) {
        shellSort(data, data.length / 2);
    }

    private static void shellSort(int[] data, int group) {

    }

}
