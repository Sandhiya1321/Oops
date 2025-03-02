public class fS {
    public static void main(String[] args){
        int p=0;
        int c=1;
        int next;
        System.out.println(p);
        System.out.println(c);
        for (int i = 0; i < 5; i++) {
            next=p+c;
            System.out.println(next);
            p=c;
            c=next;
        }
    }
}
