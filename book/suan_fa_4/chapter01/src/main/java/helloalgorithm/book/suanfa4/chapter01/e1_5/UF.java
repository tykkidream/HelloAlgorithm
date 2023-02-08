package helloalgorithm.book.suanfa4.chapter01.e1_5;

public interface UF {
    /**
     * 连接 p 和 q
     * @param p
     * @param q
     */
    void union(int p, int q);

    /**
     * 查找 p 所有连通分量的标识
     * @param p
     * @return
     */
    int find(int p);

    /**
     * 判断 p 和 q 是否连接
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p, int q);

    /**
     * 连通分量的数量
     *
     * @return
     */
    int count();

    void monit();
}
