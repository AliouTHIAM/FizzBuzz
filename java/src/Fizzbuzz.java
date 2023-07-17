package src;
/**
 * fizzbuzz
 */
public class Fizzbuzz {

    public Fizzbuzz(){};

    public void decompte(){
        for (int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Fizzbuzz klk=new Fizzbuzz();

        klk.decompte();
    }
}