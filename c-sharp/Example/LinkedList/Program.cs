using System;

namespace LinkedList
{
    public class Node
    {
        public int data;
        public Node next;

        public Node(int i)
        {
            data = i;
            next = null;
        }

        public void Print()
        {
            Console.WriteLine("|" + data + "|->");
            if (next != null)
            {
                next.Print();
            }
        }

        public void AddSorted(int data)
        {
            if (next == null)
            {
                next = new Node(data);
            }
            else if (data < next.data)
            {
                Node temp = new Node(data);
                temp.next = next;
                next = temp;
            }
            else
            {
                next.AddSorted(data);
            }
        }

        public void AddToEnd(int data)
        {
            if (next == null)
            {
                next = new Node(data);
            }
            else
            {
                next.AddToEnd(data);
            }
        }
    }

    public class MyList
    {
        private Node _headNode;

        public MyList()
        {
            _headNode = null;
        }

        public void AddToEnd(int data)
        {
            if (_headNode == null)
            {
                _headNode = new Node(data);
            }
            else
            {
                _headNode.AddToEnd(data);
            }
        }

        public void AddSorted(int data)
        {
            if (_headNode == null)
            {
                _headNode = new Node(data);
            }
            else if (data < _headNode.data)
            {
                AddToBeginning(data);
            }
            else
            {
                _headNode.AddSorted(data);
            }
        }

        public void AddToBeginning(int data)
        {
            if (_headNode == null)
            {
                _headNode = new Node(data);
            }
            else
            {
                Node temp = new Node(data);
                temp.next = _headNode;
                _headNode = temp;
            }
        }

        public void Print()
        {
            _headNode?.Print();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            MyList list = new MyList();
            list.AddToEnd(9);
            list.AddToEnd(5);
            list.AddToEnd(11);
            list.AddToEnd(4);
            list.AddToBeginning(9);
            list.AddToBeginning(5);
            list.AddToBeginning(11);
            list.AddToBeginning(4);
            list.AddSorted(9);
            list.AddSorted(5);
            list.AddSorted(11);
            list.AddSorted(4);
            list.Print();
        }
    }
}