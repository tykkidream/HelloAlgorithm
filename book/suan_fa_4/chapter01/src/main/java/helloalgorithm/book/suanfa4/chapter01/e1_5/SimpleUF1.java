package helloalgorithm.book.suanfa4.chapter01.e1_5;

public class SimpleUF1 extends AbstractUF {

    public SimpleUF1(int dataSize) {
        super(dataSize);
    }

    @Override
    public void union(int p, int q) {
        int pv = find(p);
        int qv = find(q);

        if (pv == qv) {
            return;
        }

        for (int i = 0; i < data.length; i++) {
            monitReadTimes++;
            if (data[i] == qv) {
                data[i] = pv;
                monitWriteTimes++;
            }
        }

        count = count - 1;
    }


    public static void main(String[] args) {
        UF uf = new SimpleUF1(1000);

        ca(uf, 0, 1);
        uf.monit();

        ca(uf, 2, 3);
        uf.monit();

        ca(uf, 0, 3);
        uf.monit();

        ca(uf, 1, 2);
        uf.monit();

    }

    public static void ca(UF uf, int p, int q) {
        boolean connected1 = uf.connected(p, q);

        if (connected1) {
            System.out.println(String.format("p：%s    q：%s    connected1：%s", p, q, connected1));
            return;
        }

        uf.union(p, q);

        boolean connected2 = uf.connected(q, q);

        System.out.println(String.format("p：%s    q：%s    connected1：%s    connected2：%s", p, q, connected1, connected2));
    }
}
