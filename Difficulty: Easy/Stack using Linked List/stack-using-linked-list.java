class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
         StackNode newNode=new StackNode(a);
        newNode.next=top;
        top=newNode;
    }
    int pop() {
        if(top==null)
        return -1;
        int pop=top.data;
        top=top.next;
        return pop;
    }
}