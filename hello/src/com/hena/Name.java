package com.hena;
public class Name {

    public static void myName(String a){
        System.out.println(a);
    }
    public static void main(String arg[]){
        int a =5;
        for(int i =0; i<5;i++)
        {
            if(a<8)
            {
                System.out.println("Lesser than "+a);
            }
            else{
                System.out.println("Grater than "+ a);
            }
            a++;
        }
        myName("kunal");
    }
}
