public class MyNode<K> implements INode<K> {
    private K key;
    private INode<K> next;

    public MyNode(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    public String toString() {
        StringBuffer nodeString = new StringBuffer();
        nodeString.append(key).append("->");
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }
}
