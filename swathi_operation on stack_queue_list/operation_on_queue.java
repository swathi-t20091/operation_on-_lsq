// Java program to demonstrate a Queue

import java.util.*;;

public class operation_on_queue {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		Queue<Integer> pq = new PriorityQueue<>();
        int option,value,choice=1;
        do{
            System.out.println("=========================================================================================");
        System.out.println("enter your option\n1.add an element\n2.delete an element\n3.top element\n4.print queue");
        option=sc.nextInt();
        
        switch(option){
            case 1:
            System.out.println("enter the value");
            value=sc.nextInt();
            pq.add(value);
            break;
            case 2:
            System.out.println("enter the value");
            value=sc.nextInt();
            pq.remove(value);
            break;
            case 3:
            System.out.println("top element :"+pq.poll());
            break;
            case 4:
            System.out.println("queue");
            System.out.println(pq);
            break;
            default:
            System.out.println("invalid");
            choice=0;
        }  
        System.out.println("=========================================================================================");
        System.out.println("\nenter your option\n1.continue\n2.exit");
        choice=sc.nextInt();
        }while(choice==1);

	}
}
