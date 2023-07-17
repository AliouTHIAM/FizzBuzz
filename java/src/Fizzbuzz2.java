package src;
public class Fizzbuzz2 {
    
    public Fizzbuzz2(){};

    public void decompte(){
        for (int i=1;i<=100;i++){
            String sortie=new String();
            String nombre=new String();
            nombre=String.valueOf(i);
            if(i==33){
                sortie+="FizzFizz";
            }
            else if(i==55){
                sortie+="BuzzBuzz";
            }
            else if(nombre.contains("3")){
                sortie+="Fizz";
            }
            else if(nombre.contains("5")){
                sortie+="Buzz";
            }
                
            
            if(i%3==0 && i%5==0){
                sortie+="FizzBuzz";
            }
            else if(i%3==0){
                sortie+="Fizz";
            }
            else if (i%5==0){
                sortie+="Buzz";
            }
            else{
                System.out.println(i);
            }

            System.out.println(sortie);
            
    }
}

    public static void main(String[] args) {
        Fizzbuzz2 klk=new Fizzbuzz2();

        klk.decompte();
    }

}
