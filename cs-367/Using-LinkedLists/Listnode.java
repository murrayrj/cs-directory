public class Listnode<E> {
    //*** fields ***
    private E data;
    private Listnode<E> next;

    //*** constructors ***
    // 2 constructors
    public Listnode(E d, Listnode<E> n) {
        data = d;
        next = n;
    }

    public Listnode(E d) {
        this(d, null);
    }


    //*** methods ***
    // access to fields
    public E getData() {
        return data;
    }

    public Listnode<E> getNext() {
        return next;
    }

    // modify fields
    public void setData(E d) {
        data = d;
    }

    public void setNext(Listnode<E> n) {
        next = n;
    }

    public static Listnode deleteNode(Listnode head, String d) {
        Listnode n = head;

        if (n.data == d) {
            // special case: n is the first node in the list
            return head.getNext();
        }

        // general case: find the node before n, then "unlink" n
        while (n.getNext() != null) {  // find the node before n
            if (n.getNext().getData() == d) {
                head.next = n.getNext().getNext();
                return head;
            }
            n = n.getNext();
        }
        return head;
    }

    public static void printList(Listnode head) {
        Listnode currNode = head;
        System.out.print("LinkedList: ");
        while (currNode.getNext() != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.printf("%n");
    }

    public static void main(String[] args) {
        Listnode<String> l;
        l = new Listnode<String>("ant");
        l.setNext(new Listnode<String>(null));
        l.setNext(new Listnode<String>("cat", l.getNext()));
        l.getNext().setNext(new Listnode<String>("rat", l.getNext().getNext()));
        printList(l);
        l = deleteNode(l, "cat");
        printList(l);
    }
}