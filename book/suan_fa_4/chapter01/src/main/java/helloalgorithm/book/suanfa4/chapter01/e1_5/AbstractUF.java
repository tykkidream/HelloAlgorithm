package helloalgorithm.book.suanfa4.chapter01.e1_5;

public abstract class AbstractUF implements UF {
    private int[] data;

    private int count;

    public AbstractUF(int dataSize) {
        data = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            data[i] = i;
        }

        count = data.length;

    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
