package com.example.datastructures;

import android.util.Log;

//public class Queue {
    class Node<T>{
        T data; //class node and its constructor
        Node next;
        Node(T d){
            this.data =d;
            this.next = null;
        }
    }
    class Queue<T>{
        private static final String a = "list";
        private static final String s = "size";
        int size=1;
        Node front, rear;
        Queue(){
            this.front = this.rear = null;
        }
        public void enQueue(T data){           //push the element from the rear end
            Node node = new Node(data);
            if(this.rear ==null){
                this.front= this.rear = node;
                return;
               // Log.d(a,"rear is null");
            }
            this.rear.next = node;
            this.rear = node;                 //update the rear node
            size++;
        }

        public void deQueue(){
            if(this.front == null){
                return;
            }
            Node temp = this.front;   //pop the element from the front end
            this.front.next = front;  //by pointing the pointer to the next node
            size--;
        }
        public boolean size(){
            Log.d(s, "size" + size+" ");
            return true;
        }
        public boolean printList()
        // printing the full Queue
        {

            Node list = front;
            while (list != null) {
                Log.d(a,"list" + list.data + " ");
                list = list.next;

            }
            return  true;
        }
        public boolean swapNodes(T x, T y)
        {

            // find the node x from front side
            Node prevnodeX = null, currnodeX = front;
            while (currnodeX != null && currnodeX.data != x)
            {
                prevnodeX = currnodeX;
                currnodeX = currnodeX.next;
            }

            // find the node y
            Node prevnodeY = null, currnodeY = front;
            while (currnodeY != null && currnodeY.data != y)
            {
                prevnodeY = currnodeY;
                currnodeY = currnodeY.next;
            }



            // If x is not head of linked list
            //swapping the nodes x and y
            if (prevnodeX != null)
                prevnodeX.next = currnodeY;
            else //change the y as new head
                rear = currnodeY;

            // If y is not head of linked list
            //swapping the nodes x and y
            if (prevnodeY != null)
                prevnodeY.next = currnodeX;
            else //change the x as new head
                front = currnodeX;

            // Swap next pointers
            Node temp = currnodeX.next;
            currnodeX.next = currnodeY.next;
            currnodeY.next = temp;

        return true;
        }
    }


//}
