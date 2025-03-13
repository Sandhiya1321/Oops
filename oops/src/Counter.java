public class Counter {
    int value;
    static int count=0;
   public static void count(){
       count++;
   }
   public static int getCount(){
       return count;
   }
   void countValue(){
       count++;
   }
   int getValue(){
       return count;
   }
    public static void main(String[] args) {
        System.out.println("initial count "+count);
       Counter counter=new Counter();
       counter.countValue();
        System.out.println("value count is "+ counter.getValue());
        Counter.count();
        System.out.println("after one increment :"+Counter.count);
        Counter.count();
        System.out.println("after two increment "+Counter.count);
    }
}