import java.security.DigestOutputStream;
import java.util.Date;
import java.util.function.DoublePredicate;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500; // Dois mil e quiemtos
       double salarioMaximo = 2.500; // dois e meio 2,5


       short numeroCurto =1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal; // casting

      int numero = 5;
      numero =10; // mudando valor 
      System.out.println(" valor mudou para " + numero);

      final double VALOR_DE_PI = 3.14; // Constante__convençao de nome mais palavra "final"
        
      
      int idade = 20;
      float idade2 =3f;
      idade = (int)idade2; //casting

      int areaEstado = 300;
      double areaPais = areaEstado * 25; //casting implicito

       //OPERADORES

    String nome = "Joao";
    int idadeOperador = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimaneto = new java.util.Date();

    System.out.println(dataNascimaneto);

        //operadores aritimeticos 

        double soma = 10.5 + 15.6;
        int subtraçao = 50-47;
        int multiplicaçao = 30*8;
        int divisao = 15/3;
        int modulo = 18%3;
        double resultado = (10*7) + (20/4); // mix de operadores
        



    






    }
}
