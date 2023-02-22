public class MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void add(int veri) {
        Node node = new Node(veri);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            tail = tail.getNextNode();
        }
        size++;
    }

    public int getRandom() {
        int index = (int) (Math.random()*size);
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getVeri();
    }

    public void removeLast() {
        Node currentNode = head;
        while (currentNode.getNextNode().getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        tail = currentNode;
        size--;
    }

    public void remove(int veri) {
        Node currentNode = head;
        if (currentNode.getVeri() == veri) {
            head = head.getNextNode();
        } else {
            while (currentNode.getNextNode().getVeri() != veri) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        }
        size--;
    }

    public void addArray(int[] array) {
        for (int i : array) {
            add(i);
        }
    }

    public void printList() {
        if (size == 0) {
            System.out.println("Liste bos!!");
        } else {
            String liste = "[";
            Node currentNode = head;
            while(currentNode != null) {
                liste += currentNode.getVeri() + ", ";
                currentNode = currentNode.getNextNode();
            }
            liste = liste.substring(0, liste.length()-2) + "]";
            System.out.println(liste);
        }
    }

    public String toString() {
        if (size == 0) {
            return "Liste bos!!";
        } else {
            String liste = "[";
            Node currentNode = head;
            while(currentNode != null) {
                liste += currentNode.getVeri() + ", ";
                currentNode = currentNode.getNextNode();
            }
            liste = liste.substring(0, liste.length()-2) + "]";
            return liste;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}