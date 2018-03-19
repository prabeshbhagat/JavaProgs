public class IntegerReverse {

    public static void main(String [] args){


      //  1.Using Algo
        int num=1234;
        int rev=0;

        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }

        System.out.println(rev);
//        System.out.println("Hello World");

        //Using String Buffer
        int num1=12345;
        StringBuffer sb= new StringBuffer(String.valueOf(num1));
        System.out.println(sb.reverse());
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

    }
}
