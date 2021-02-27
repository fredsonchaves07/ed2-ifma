package implement.Lista;

import java.util.Objects;

public class Node <Generic>{
    private Generic data;
    private Node nextNode;
    private Node beforeNode;

    public void setData(Generic data) {
        this.data = data;
    }

    public Generic getData() {
        return this.data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public void setBeforeNode(Node beforeNode) {
        this.beforeNode = beforeNode;
    }

    public Node getNextNode() {
        return this.nextNode;
    }
}