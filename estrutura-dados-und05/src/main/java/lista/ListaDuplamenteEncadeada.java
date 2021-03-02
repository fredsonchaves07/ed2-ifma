package lista;

import java.util.Objects;

public class ListaDuplamenteEncadeada <Generic> {

    private Node startList;
    private Node endList;
    private int lenght;

    public ListaDuplamenteEncadeada(){
        this.startList = null;
        this.endList = null;
        this.lenght = 0;
    }

    public int lenght() {
        return this.lenght;
    }

    public boolean isEmpty(){
        if(this.lenght == 0){
            return true;
        }

        return false;
    }

    public void list() {

        if(isEmpty()){
            System.out.print("Espaço Vazio ");
        }

        Node nodeAux = startList;

        while(nodeAux != null){
            System.out.print(nodeAux.getData() + " ");
            nodeAux = nodeAux.getNextNode();
        }

    }

    public void add(Object data) {
        Node element = new Node();

        element.setData((Generic) data);
        element.setBeforeNode(null);
        element.setNextNode(null);

        if(this.isEmpty()){
            this.startList = element;
            this.endList = element;
            this.lenght ++;
        } else {
            this.startList.setBeforeNode(element);
            element.setNextNode(this.startList);
            this.startList = element;
            this.lenght ++;
        }
    }

    public Generic find(Object data) {
        if(this.isEmpty()){
            return null;
        }

        Node nodeAux = startList;

        while(nodeAux != null){
            if(nodeAux.getData() == data){
                return (Generic) nodeAux.getData();
            }
            nodeAux = nodeAux.getNextNode();
        }

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaDuplamenteEncadeada<?> that = (ListaDuplamenteEncadeada<?>) o;
        return Objects.equals(startList, that.startList) && Objects.equals(endList, that.endList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startList, endList);
    }

    public boolean remove(Object data) {
        if (isEmpty()) {
            return false;
        }

        Node element;
        Node nextElement;
        Node beforeElement;

        element = startList;
        while (element != null) {
            nextElement = element.getNextNode();
            beforeElement = element.getNextNode();

            if (element.getData() == data) {
                if (beforeElement != null) {
                    if (nextElement != null) {
                        beforeElement.setNextNode(nextElement);
                        nextElement.setBeforeNode(beforeElement);
                        element = null;
                        lenght--;
                        return true;
                    } else {
                        beforeElement.setNextNode(null);
                        endList = beforeElement;
                        element = null;
                        lenght--;
                        return true;
                    }
                } else {
                    if (nextElement != null) {
                        nextElement.setBeforeNode(null);
                        startList = nextElement;
                        element = null;
                        lenght--;
                        return true;
                    } else {
                        element = null;
                        lenght--;
                        return true;
                    }
                }
            } else {
                element = element.getNextNode();

            }
        }


        return false;
    }

}