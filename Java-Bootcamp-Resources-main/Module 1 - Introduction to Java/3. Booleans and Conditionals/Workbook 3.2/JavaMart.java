public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if(toyCar <= wallet){
            System.out.println("Sure!");
        }else{
            System.out.println("Sorry I have only $"+ wallet + " left.");
        }
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.
        wallet-=toyCar;
        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(nike <= wallet){
            System.out.println("Sure!");
        }else{
            System.out.println("Sorry I have only $"+ wallet + " left.");
        }

    }
}
