package hello.algorithm.sort.lesson05;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 根据自己的理解，第一版，正序
 */
public class QuickSort01 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        quickSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int left = begin;
        int right = end;

        int base = data[right];

        while (left < right) {
            while (left < right) {
                int temp = data[left];

                if (temp > base) {
                    data[right] = temp;
                    right--;
                    break;
                } else {
                    left++;
                }
            }
            while (left < right) {
                int temp = data[right];

                if (temp < base) {
                    data[left] = temp;
                    left++;
                    break;
                } else {
                    right--;
                }
            }
        }

        // 此时 left == right
        data[left] = base;

        quickSort(data, begin, left - 1);
        quickSort(data, right + 1, end);
    }
}
