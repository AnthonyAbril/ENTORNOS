
package refactoring1;

public class Refactoring1 {
    public static void main(String[] args) {
      int nre = 3;
      
      System.out.println("Factorial de " + nre + ": " + calculFactorial(nre));
    }
    
    public static int calculFactorial(int nre){
        //We move this code to a separate new method and replace the old code with a call to the method.
        int comptador = 1;
        int resultat = 1;

        while (comptador<=nre){
                resultat = resultat * comptador;
                comptador++;
        }
        
        return resultat;
    }
}
