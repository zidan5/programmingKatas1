import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Katas {



        public static  void hello(String msg){
            System.out.println("Hello "+ msg);
        }
        public static void EvenOrOdd(int num){
            if(num%2==1){
                System.out.println(num+" is Odd");
            }else {
                System.out.println(num+" is even");
            }
        }
        public static void LongestString(String[] Arr) {
            String LongStr = Arr[0];

            for(int i=0; i<Arr.length; i++){

                if(LongStr.length() < Arr[i].length())
                    LongStr = Arr[i];
            }
            System.out.println("\""+LongStr+"\" is the longest word");
        }
        public static void MultLongStr(String[] Arr) {
            String str = Arr[0];

            for (int i = 0; i < Arr.length; i++) {
                if (str.length() <= Arr[i].length()) {
                    str = Arr[i];
                }
            }
            for(int j=0; j< Arr.length; j++){
                if(str.length()==Arr[j].length())
                    System.out.println(Arr[j]);
            }

        }
        public  static void square(int num){

            for(int i=0; i<num; i++){
                System.out.println();
                for(int j=0; j<num; j++) {
                    System.out.print("#  ");
                }
            }
        }
        public  static void triangle(int num){

            for(int i=0; i<num; i++){

                for(int j=0; j<num; j++){;
                    if(j <= i)
                        System.out.print("#");
                }
                System.out.println();
            }
        }
        public static void isosceles(int num){

            for(int i=0; i<num; i++){       //Bottom # triangle adjusted in center
                System.out.println();
                for(int j=0; j<num - i; j++) {     // (5-0), (5-1), (5-2), (5-3), (5-4), (5-5) inner  looping level
                    System.out.print(" ");    // 5, 4, 3, 2, 1, 0  printing
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
        public static void CombineValues(int[] values1, int[] values2){
            List<Integer> li = new ArrayList<Integer>();

            for(int i=0; i<values1.length ; i++) {
                if(i % 2 == 0){

                    li.add(values1[i]);
                    li.add(values2[i]);
                }else{

                    li.add(values1[i]);
                    li.add(values2[i]);
                }
            }

            System.out.println(li.toString());
        }
        public static boolean ValidateInput(String str){
            boolean Bool = true;
            try{
                int number = Integer.parseInt(str);
            }catch ( NumberFormatException e ){
                Bool =false;
            }
            return Bool;
        }
        static void framedNames() {
            System.out.println("How many words do you want to enter");
            Scanner sc = new Scanner(System.in);
            int NumberOfWords;
            String str = sc.next();
            if(ValidateInput(str)){
                NumberOfWords = Integer.parseInt(str);
            }else{
                throw new NumberFormatException("Invalid input");
            }

            System.out.println("Enter "+NumberOfWords+" words");
            String[] StoringWords  = new String[NumberOfWords];

            for(int i=0; i<StoringWords.length; i++){
                StoringWords[i] = sc.next();
            }

            int maxsize = StoringWords.length;


            for (int i = 0; i <= maxsize + 1; i++) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
            for (int j = 0; j < StoringWords.length; j++) {
                System.out.print("* " + StoringWords[j]);
                for (int i = StoringWords[j].length(); i <= maxsize; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            System.out.print("*");
            for (int i = 0; i <= maxsize + 1; i++) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();


        }



        public static void main(String Args[]) {

            System.out.println("Enter your name");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            hello(name);

            System.out.println("Type any number to see if it is even or odd");
            int number = sc.nextInt();
            EvenOrOdd(number);

            System.out.println("Type 5 words and get the longest one");
            String[] words = new String[5];
            for(int i=0; i<words.length; i++){
                words[i] = sc.next();
            }
            LongestString(words);

            System.out.println("Type 5 words to get multiple of the longest words");
            String[] mWords = new String[5];
            for(int i=0; i< mWords.length; i++){
                mWords[i] = sc.next();
            }
            MultLongStr(mWords);

            System.out.println("Enter a number to build your square");
            int num = sc.nextInt();
            square(num);

            System.out.println("\nEnter a number to build a right angled triangle");
            int triangle = sc.nextInt();
            triangle(triangle);

            System.out.println("\nEnter a number to build a Pyramid");
            int num2 = sc.nextInt();
            isosceles(num2);

            int[] values1 = new int[3];
            int[] values2 = new int[3];
            System.out.println("Enter 3 integer values to get a mixed array");
            for(int i= 0; i < 3; i++){
                values1[i] = sc.nextInt();
            }
            System.out.println("Enter another 3 integer values");
            for(int i= 0; i < 3; i++){
                values2[i] = sc.nextInt();
            }
            CombineValues(values1,values2);

            framedNames();

        }
    }


