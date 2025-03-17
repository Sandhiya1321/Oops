public class singleTon {
    private static singleTon instance;
    private singleTon(){

    }
    public static singleTon getInstance(){
        if(instance==null){
            instance=new singleTon();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("log: "+message);
    }

    public static void main(String[] args) {
        singleTon logger= singleTon.getInstance();
        logger.log("this is a singleton logger instance");
    }
}
