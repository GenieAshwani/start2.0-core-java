package Queue;


class MyQueue
{
    private int[] customQueue;
    int f;
    int r;
    int size;

    MyQueue(int size)
    {
        this.customQueue=new int[size];
        this.f=0;
        this.r=-1;
    }


    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        customQueue[++r]=data;
        System.out.println("data added : "+data);
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        int data=customQueue[f];
        f++;
        System.out.println("data removed "+data);
    }

    public void show()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=f;i<=r;i++)
        {
            System.out.println(customQueue[i]);
        }
    }


    public boolean isEmpty()
    {
        return f>r;
    }

    public boolean isFull()
    {
        return r==customQueue.length-1;
    }

}
public class QueueDemo {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(80);

        queue.show();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


        queue.show();

        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(30);
        queue.show();
    }
}
