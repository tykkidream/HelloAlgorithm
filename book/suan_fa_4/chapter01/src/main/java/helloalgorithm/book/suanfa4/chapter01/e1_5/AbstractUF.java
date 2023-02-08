package helloalgorithm.book.suanfa4.chapter01.e1_5;

public abstract class AbstractUF implements UF {
    protected int[] data;

    protected int count;

    protected int monitReadTimes;
    protected int monitWriteTimes;

    public AbstractUF(int dataSize) {
        data = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            data[i] = i;
        }

        count = data.length;
    }

    @Override
    public int find(int p) {
        return data[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }

    public void monit() {
        System.out.println(String.format("读次数：%s  写次数：%s", monitReadTimes, monitWriteTimes));
    }
}
