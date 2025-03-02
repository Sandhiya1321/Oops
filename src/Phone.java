
import java.util.ArrayList;

public class Phone {
    String name;
    static int model;
    int price;
    String OS;
    static String company;

    public Phone(String name,int model,int price,String OS,String company){
        this.name=name;
        this.model=model;
        this.price=price;
        this.OS=OS;
        this.company=company;
    }
    public static Phone findModel(Phone ph){

        if(company.equals("Samsung")&& model>2022){
            System.out.println(ph.model  + "  "+ ph.price);

        }
        return ph;
    }



}


