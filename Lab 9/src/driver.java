import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        Node<Integer> fNode = new Node<>();
        fNode.setElement(5);
        Node<String> sNode = new Node<>();
        sNode.setElement("Binsa");
        Node<Double> tNode = new Node<>(4.37);
        System.out.println(fNode+""+sNode+tNode);
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(6));
        nodes.add(new Node("Amir"));
        nodes.add(new Node(36.72));
        for(Node node : nodes){
            System.out.println(node);
        }
        Node<Integer> fiNode = new Node<>(15);
        fiNode.setNext(new Node("Stef"));
        System.out.println(fiNode);

    }
}
