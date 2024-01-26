package BPlusTree;

public class Drive {
        public static void main(String[] args) {
            BPlusTree bPlusTree = new BPlusTree();
            bPlusTree.insert(3);
            bPlusTree.insert(1);
            bPlusTree.insert(4);
            bPlusTree.insert(2);

            System.out.println("B+Tree 출력:");
            bPlusTree.print();
        }

}
