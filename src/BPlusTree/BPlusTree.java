package BPlusTree;

import java.util.ArrayList;
import java.util.List;

class BPlusTree {
    private Node root;

    // 노드 클래스
    static class Node {
        List<Integer> keys;
        List<Node> children;

        Node() {
            keys = new ArrayList<>();
            children = new ArrayList<>();
        }
    }

    // B+Tree 삽입
    void insert(int key) {
        if (root == null) {
            root = new Node();
            root.keys.add(key);
        } else {
            insertRecursive(root, key);
        }
    }

    // 재귀적으로 삽입
    private void insertRecursive(Node node, int key) {
        if (node.children.isEmpty()) {
            // Leaf 노드에 도달하면 키를 추가
            insertSorted(node.keys, key);
        } else {
            // 적절한 자식 노드를 찾아 재귀 호출
            int index = findChildIndex(node.keys, key);
            insertRecursive(node.children.get(index), key);
        }

        // 노드 분할 및 부모 노드에 삽입 로직은 생략
    }

    // 정렬된 리스트에 삽입
    private void insertSorted(List<Integer> list, int key) {
        int index = 0;
        while (index < list.size() && list.get(index) < key) {
            index++;
        }
        list.add(index, key);
    }

    // 적절한 자식 노드의 인덱스 찾기
    private int findChildIndex(List<Integer> keys, int key) {
        int index = 0;
        while (index < keys.size() && keys.get(index) < key) {
            index++;
        }
        return index;
    }

    // B+Tree 출력 (전위 순회)
    void print() {
        printRecursive(root);
    }

    private void printRecursive(Node node) {
        if (node != null) {
            System.out.print("[");
            for (int i = 0; i < node.keys.size(); i++) {
                System.out.print(node.keys.get(i));
                if (i < node.keys.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            for (Node child : node.children) {
                printRecursive(child);
            }
        }
    }
}

