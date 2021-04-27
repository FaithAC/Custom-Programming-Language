import java.util.LinkedList;
public class Node {

   String label;
   LinkedList<Node> child;

   public Node(String label) {
      this.label = label;
   }

   public void addChild(Node n) {
      if (child == null)
         child = new LinkedList<Node>();
      child.add(n);
   }

}
