package stack;

class MyStack{
    private int[] customStack;
    int f;
    int size;

    MyStack(int size)
    {
        this.size=size;
        this.customStack=new int[size];
        this.f=-1;
    }

    public void pop()
    {
        //check stack is empty or not ?
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("value removed : "+customStack[this.f]);
        f--;
    }

    public void push(int data)
    {
        if(isFull())
            {
                System.out.println("Stack is full");
                return;
            }
        customStack[++f]=data;
        System.out.println("data inserted : "+data);
    }
    public boolean isFull()
    {
        //top refernce value ha wo -1 ha
        return f==customStack.length-1 ;
    }

    public boolean isEmpty()
    {
        //top refernce value ha wo -1 ha
        return f==-1;
    }

    public void show()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty:");
            return;
        }
        for(int i=f;i>=0;i--)
        {
            System.out.println(customStack[i]);
        }
    }
}


public class StackDemo {

    public static void main(String[] args) {
        MyStack stack=new MyStack(5);

        // pushing data into stack
        stack.push(-1);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(60);

        //show
        stack.show();

        //remove
        stack.pop();
        stack.pop();

        stack.show();
    }
}
