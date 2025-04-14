package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b=0;
        try{
            div(a,b);
//            throw new Exception("just a joke");
            String name="Sandy";
            if(name.equals("Sandy")){
                throw new CustomException("name is sandy");
            }
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("normal exception");
        } finally {
            System.out.println("hello");
        }
    }
    static int  div(int a,int b) throws ArithmeticException{

        if(b==0){
            throw new ArithmeticException("dont divide by zero");
        }
        return a/b;
    }
}
