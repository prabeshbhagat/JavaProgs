public class BubbleSort {



    public static void sort(int array [] ){
        int m=array.length;
        for(int o=m;o>0;o--){
            for (int k=0;k<m-1;k++){
                int l=k+1;
                if(array[k]>array[l]){
                    swapMe(k,l,array);
                }

            }
            printNums(array);

        }
 }


   private static void swapMe(int i,int j,int array[]){

       int temp;
       temp=array[i];
       array[i]=array[j];
       array[j]=temp;
   }

    private static void printNums(int array []){

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ,");
        }

        System.out.println("\n");
    }

    public static void main(String [] args){

        int input []={12,32,33,233,2,5,34};
        sort(input);

    }


}




//    public  static void bubbleSort(int array []){
//        int n=array.length;
//        int k;
//
//        for(int l=0;l<n;l++) {
//
//            for(int i=0;i<n-1;i++){
//                k=i+1;
//                if (array[i]> array[k]){
//                    swapMe(i,k,array);
//                }
//
//            }
//            printNums(array);
//
//        }
//    }
//    private static  void swapMe(int i,int j,int [] array){
//        int temp;
//        temp=array[i];
//        array[i]=array[j];
//        array[j]=temp;
//    }
//
//
//    private static void printNums(int [] input){
//        for (int i=0;i<input.length;i++){
//            System.out.print(input[i]+",");
//        }
//        System.out.println("\n");
//    }
//
//    public static void  main(String [] args){
//        int [] input={4,23,1,533,34,12,65,34,2};
//        bubbleSort(input);
//    }
