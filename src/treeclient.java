public class treeclient {
    public static void main(String[] args) {
        tree_structure bt=new tree_structure();
        bt.display();
        System.out.println(bt.find(100));
        System.out.println(bt.max());
        bt.preOrder();
        bt.levelOrder();
        //10 true 20 true 30 false true 50 false false false true 40 true 60 false false false
    }
}