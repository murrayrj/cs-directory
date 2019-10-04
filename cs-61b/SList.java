public class SList {
    private class SNode {
        public int item;
        public SNode next;

        public SNode(int item, SNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private SNode front;

    public void insertFront(int x) {
        front = new SNode(x, front);
    }

    public void insert(int item, int position) {
        if (front == null || position == 0) {
            insertFront(item);
            return;
        }
        SNode currentNode = front;
        while (position > 1 && currentNode.next != null) {
            position--;
            currentNode = currentNode.next;
        }
        SNode newNode = new SNode(item, currentNode.next);
        currentNode.next = newNode;
    }

    public void reverse() {
        SNode frontOfReversed = null;
        SNode nextNodeToAdd = front;
        while (nextNodeToAdd != null) {
            SNode remainderOfOriginal = nextNodeToAdd.next;
            // Put nextNodeToAdd on the front of the reversed list.
            nextNodeToAdd.next = frontOfReversed;
            // Update the pointers.
            frontOfReversed = nextNodeToAdd;
            nextNodeToAdd = remainderOfOriginal;
        }
        front = frontOfReversed;
    }

    private SNode reverseRecursiveHelper(SNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            // Reverse everything except the front node.
            SNode reversed = reverseRecursiveHelper(head.next);
            // Put the front onto the back of the new reversed list.
            // Since everything after front got reversed, front.next is
            // the LAST thing in reversed. Change this last thing’s
            // next pointer to point to front, so front is now at the back
            // of reversed.
            head.next.next = head;
            // Since the front is now the last element, its next pointer
            // should be null.
            head.next = null;
            return reversed;
        }
    }

    public void reverseRecursive() {
        front = reverseRecursiveHelper(front);
    }

    public static void printList(SList list) {
        SNode currNode = list.front;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.item + " ");
            currNode = currNode.next;
        }
        System.out.printf("%n");
    }

    public static void main(String[] args) {
        SList list = new SList();
        list.insertFront(2);
        list.insertFront(6);
        list.insertFront(5);
        list.insert(10, 1);
        printList(list);
        list.reverse();
        printList(list);
        list.reverseRecursive();
        printList(list);
    }
}
