package helloalgorithm.book.suanfatujie.chapter01;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class E1_2_1 {
	public static void main(String[] args) {

		List<Integer> data = new ArrayList(100);

		for (int i = 0; i < 100; i++) {
			data.add(i);
		}

		System.out.println("原始数据：" + data);

		Collections.shuffle(data);

		System.out.println("乱序数据：" + data);

		System.out.println("=============================================================================");


		int num = new Random().nextInt(99);

		System.out.println("随机数：" + num);

		System.out.println("=============================================================================");

		System.out.println("顺序查找法");

		{
			int step = 0;

			for (int i = 0; i < data.size(); i++) {
				step++;

				if (data.get(i) == num) {
					break;
				}
			}

			System.out.println("查找次数：" + step);

		}


		System.out.println("=============================================================================");

		System.out.println("二分查找法");


		{
			List<Integer> temp = new ArrayList<>(data);
			List<Integer> steps = new LinkedList<>();

			Collections.sort(temp);

			int step = 0;

			int begin = 0;
			int end = temp.size() - 1;
			int index = 0;

			while (true) {
				step++;

				index = (end - begin) / 2 + begin;

				Integer integer = temp.get(index);

				steps.add(integer);

				if (integer < num) {
					begin = index + 1;
				} else if (index > num) {
					end = index - 1;
				} else {
					break;
				}

				if (begin == end || begin > end) {
					break;
				}
			}

			System.out.println("查找次数：" + step);
			System.out.println("查找的数：" + steps);
		}

	}
}
