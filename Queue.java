/**
* Source     : queue.java
* Author     : Bonilla, Raymart
* Url        : https://github.com/mattSandoval
* Updated_at : Aug 24, 2016
*
*/
class QueueNew
   {
   private int maxSize
   private int front;
   private int rear;
   private int nItems;
   private int[] qArray;

   public QueueNew(int s) {
      maxSize = s;
      qArray = new int[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }

   public void insert(int j) {
      if(rear == maxSize-1)         
         rear = -1;
      qArray[++rear] = j;         
      nItems++;                     
   }

   public int remove() {
      int temp = qArray[front++];
      if(front == maxSize)
         front = 0;
      nItems--;           
      return temp;
   }

   public int peekFront() {
      return qArray[front];
   }

   public boolean isEmpty() {
      return (nItems==0);
   }

   public boolean isFull() {
      return (nItems==maxSize);
   }

   public int size() {
      return nItems;
   }

}
class Queue{
   public static void main(String[] args)
      {
      QueueNew theQueue = new QueueNew(5);

      theQueue.insert(1);
      theQueue.remove();
      theQueue.insert(2);
      theQueue.remove();
      theQueue.insert(3);
      theQueue.remove();
      theQueue.insert(4);
      theQueue.remove();
      theQueue.insert(1);
      theQueue.insert(1);

      while( !theQueue.isEmpty() ) {                        
         int n = theQueue.remove();
         System.out.print(n);
         System.out.print(" ");
         }
      System.out.println("");
   }
}
