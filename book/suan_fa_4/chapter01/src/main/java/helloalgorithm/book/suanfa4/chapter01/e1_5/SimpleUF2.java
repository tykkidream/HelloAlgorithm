package helloalgorithm.book.suanfa4.chapter01.e1_5;

public class SimpleUF2 extends AbstractUF {
    public SimpleUF2(int dataSize) {
        super(dataSize);
    }

    @Override
    public void union(int p, int q) {



    }


    public static void main(String[] args) {
        UF uf = new SimpleUF1(1000);

        SimpleUF1.ca(uf, 0, 1);
        uf.monit();

        SimpleUF1.ca(uf, 2, 3);
        uf.monit();

        SimpleUF1.ca(uf, 0, 3);
        uf.monit();

        SimpleUF1.ca(uf, 1, 2);
        uf.monit();
    }

}
