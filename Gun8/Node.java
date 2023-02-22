public class Node {
    private int veri;
    private Node nextNode;

    public Node(int veri) {
        this.veri = veri;
        nextNode = null;
    }

    public int getVeri() {
        return veri;
    }

    public void setVeri(int veri) {
        this.veri = veri;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        nextNode = node;
    }
}
