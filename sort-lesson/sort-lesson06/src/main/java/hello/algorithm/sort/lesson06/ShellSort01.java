package hello.algorithm.sort.lesson06;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 根据自己的理解，第一版，正序
 */
public class ShellSort01 {
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
        if (group == 0) {
            return;
        }

        for (int i = 0; i <= group; i++) {
            for (int j = group + i; j < data.length; j = j + group) {
                for (int k = j - group, l = j; k > -1; l = k, k = k - group) {
                    int a = data[k];
                    int b = data[l];

                    if (a > b) {
                        data[l] = a;
                        data[k] = b;
                    } else {
                        break;
                    }
                }
            }
        }

        shellSort(data, group / 2);
    }

}
