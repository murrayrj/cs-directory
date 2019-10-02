public class DLinkedList<E> {
    private Node head; // first node of linked list (null if none)
    private Node tail; // last node of linked list (null if none)

    private int size; // Number of values in the linked list.

    /**
     * Constructor: an empty linked list.
     */
    public DLinkedList() {
    }

    /**
     * Return the number of values in this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return the first node of the list (null if the list is empty).
     */
    public Node getHead() {
        return head;
    }

    /**
     * Return the last node of the list (null if the list is empty).
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Return the value of node e of this list.
     * Precondition: e must be a node of this list; it may not be null.
     */
    public E valueOf(Node e) {
        assert e != null;
        return e.value;
    }

    /**
     * Return a representation of this list: its values, with adjacent
     * ones separated by ", ", "[" at the beginning, and "]" at the end. <br>
     * <p>
     * E.g. for the list containing 6 3 8 in that order, the result it "[6, 3, 8]".
     */
    public String toString() {
        // Write this method first. You can test it on the empty list, which the
        // constructor creates. You can't do any more testing until you have written
        // append. Then test toString, toStringReverse, and prepend together.

        // IMPORTANT: This method should NOT use field size. In order to use toString
        // for testing, as we advocate in the handout, toString uses only the head and
        // succ fields.

        return "";
    }

    /**
     * Return a representation of this list: its values in reverse, with adjacent
     * ones separated by ", ", "[" at the beginning, and "]" at the end. <br>
     * <p>
     * E.g. for the list containing 6 3 8 in that order, the result it "[8, 3, 6]".
     */
    public String toStringReverse() {
        // Write this method second. You can test it on the empty list, which the
        // constructor creates. You can't do any more testing until you have written
        // append. Then test toString, toStringReverse, and prepend together.

        // IMPORTANT: This method should NOT use field size. In order to use
        // toStringReverse for testing, as we advocate in the handout, toStringReverse
        // uses only the tail and pred fields.


        return "";
    }

    /**
     * Insert value v in a new node at the beginning of the list and
     * return the new node
     */
    public Node prepend(E v) {
        // Method prepend is the third function to write, and test prepend, toString,
        // and toStringReverse together. Don't go on until you believe that these three
        // are correct.


        return null;
    }

    /**
     * add value v in a new node at the end of the list and
     * return the new node.
     */
    public Node append(E v) {
        // Method append is the fourth function to write and test. Don't go on until you
        // believe that it is correct.


        return null;
    }

    /**
     * Insert value v in a new node before element e and
     * return the new node.
     * Precondition: e must be a node of this list; it may not be null.
     */
    public Node insertBefore(E v, Node e) {
        // Method insertBefore is the fifth function to write and test. Don't go on until you
        // believe that it is correct.
        // Here is a hint: There really are two cases: inserting a node before the first
        // node is different from inserting one before any other node. Draw two pictures.
        // Can you do the first case in terms of a previously written method?


        return null;
    }

    /**
     * Insert value v in a new node after node e and
     * return the new node.
     * Precondition: e must be an node of this list; it may not be null.
     */
    public Node insertAfter(E v, Node e) {
        // Method insertAfter is the sixth function to write and test. Don't go on until you
        // believe that it is correct.
        // Here is a hint: There really are two cases: inserting a node after the last
        // node is different from inserting one after any other node. Draw two pictures.
        // Can you do the first case in terms of a previously written method?


        return null;
    }

    /**
     * Remove node e from this list.
     * Precondition: e must be a node of this list; it may not be null.
     */
    public void remove(Node e) {
        // Method remove is the seventh and last method you have to write and test.
        // It is the only one that does not return a value, i.e. that is a procedure.


    }


    /*********************/

    /**
     * An instance is a node of this list.
     */
    public class Node {
        /**
         * Predecessor of this node on the list (null if the list is empty).
         */
        private Node pred;

        /**
         * The value of this element.
         */
        private E value;

        /**
         * Successor of this node on the list. (null if the list is empty).
         */
        private Node succ;

        /**
         * Constructor: an instance with predecessor p (p can be null),
         * successor s (s can be null), and value v.
         */
        private Node(Node p, Node s, E v) {
            pred = p;
            succ = s;
            value = v;
        }

        /**
         * Return the value of this node.
         */
        public E getValue() {
            return value;
        }

        /**
         * Return the predecessor of this node e in the list (null if e is the
         * first node of this list).
         */
        public Node predecessor() {
            return pred;
        }

        /**
         * Return the successor of this node in this list (null if e is the
         * last node of this list).
         */
        public Node successor() {
            return succ;
        }
    }

}