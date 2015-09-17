
package cap4ej10;


public class matricula {
     double aum=0 ,  valM = 50000 , patrimonio;
       int estrato;   
      double calcular(int estrato , double patrimonio)
       {
             aum=0 ; valM = 50000 ;
       if(patrimonio > 2000000 && estrato > 3){
            aum =  patrimonio * 3 / 100;
           valM = valM + aum;
       }
       return valM;
       }
}
