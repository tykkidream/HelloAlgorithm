package hello.algorithm.sort.lesson04;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 *
 */
public class MergeSort02 {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,7,8,1,5,62,31,5,34};

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));

        mergeSort(data);

        System.out.println(JSON.toJSONString(data, SerializerFeature.PrettyFormat));
    }

    private static void mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private static void mergeSort(int[] data, int begin, int end) {
        if (begin == end) {
            return;
        }

        int middle_begin = (begin + end) / 2;
        int middle_end = middle_begin + 1;

        mergeSort(data, begin, middle_begin);
        mergeSort(data, middle_end, end);

        merge(data, begin, middle_begin, middle_end, end);
    }

    private static void merge(int[] data, int begin, int middle_begin, int middle_end, int end) {
        int[] temp = new int[end - begin + 1];

        int i = 0;
        int left_begin = begin;
        int left_end = middle_begin;
        int right_begin = middle_end;
        int right_end = end;

        while (left_begin <= left_end && right_begin <= right_end) {
            int left  = data[left_begin];
            int right = data[right_begin];

            // 倒序
            if (left > right) {
                temp[i] = left;
                left_begin++;
            } else {
                temp[i] = right;
                right_begin++;
            }

            i++;
        }


        while (left_begin <= left_end && right_begin > right_end) {
            temp[i] = data[left_begin];

            i++;
            left_begin++;
        }

        while (left_begin > left_end && right_begin <= right_end) {
            temp[i] = data[right_begin];

            i++;
            right_begin++;
        }

        for (i = 0, left_begin = begin; i < temp.length; i++, left_begin++) {
            data[left_begin] = temp[i];
        }
    }
}
