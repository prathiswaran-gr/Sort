import java.util.Arrays;
import java.util.Scanner;

public class MyQueue implements QueueOperations {
    int[] queue=new int[5];
    int rear=-1;
    int front=-1;
    static int ch,ele;
    @Override
    public void enqueue() {
        if(front==-1 && rear == -1){
            front=rear=0;
            queue[rear]=ele;
        }
        else if ((front == 0 && rear==queue.length-1) || front>rear){
            System.out.println("OverFlow!");
        }
        else{
            rear++;
            queue[rear]=ele;
        }
    }

    @Override
    public void dequeue() {
        if((front==-1 && rear == -1 )|| (front> rear)){
            System.out.println("UnderFlow!");
        }
        else{
            front++;
        }

    }

    @Override
    public void display() {
        if((front==-1 && rear == -1 )|| (front> rear)){
            System.out.println("UnderFlow!");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }

    }

    @Override
    public void peek() {
        if((front==-1 && rear == -1 )|| (front> rear)){
            System.out.println("UnderFlow!");
        }
        else
            System.out.println("Front:"+queue[front]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue mq = new MyQueue();
        System.out.println("---Queue Implementation-----\n1.Enqueue\n2.Dequeue\n3.Display\n4.Peek\n5.Exit");
        do{
            System.out.print("\nEnter your choice:");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter the element to be enqueue:");
                    ele = sc.nextInt();
                    mq.enqueue();
                    break;
                case 2:
                    mq.dequeue();
                    break;
                case 3:
                    mq.display();
                    break;
                case 4:
                    mq.peek();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter correct choice (1-4) 5 to exit..");
            }


        }while(ch!=5);
    }
}
