package LessonSort.Bubble;

public class Bubble {
    public static void main(String[] args) {

        int []  arry = new int[10];

        for (int i= 0 ; i<arry.length ; i++){
            int rand = (int)(Math.random()*9) ;
            arry[i]=rand;
        }

        for (int print:arry) {
            System.out.print(print);
        }
        System.out.println();

        for (int i=0 ; i<arry.length ; i++){
            System.out.print(arry[i]);
        }
        System.out.println();

        for (int j=0 ; j<arry.length ; j++ ){
            for (int i = 0 ; i < (arry.length - 1) ; i++ ){
                if (arry[i] >arry[i+1]){
                    int a = arry[i+1];
                    arry[i+1] = arry[i] ;
                    arry[i] = a ;
                }
            }
        }


        for (int i=0 ; i<arry.length ; i++){
            System.out.print(arry[i]);
        }
        System.out.println();











    }
}
