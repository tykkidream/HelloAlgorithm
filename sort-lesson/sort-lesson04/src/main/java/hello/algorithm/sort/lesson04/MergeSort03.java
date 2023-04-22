package hello.algorithm.sort.lesson04;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 *
 */
public class MergeSort03 {
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
        
    }
}
