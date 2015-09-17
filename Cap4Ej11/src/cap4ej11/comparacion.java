
package cap4ej11;


public class comparacion {
    int Num1 , Num2 , Num3;
    String resul;
    
    String Comparar(int Num1 ,int Num2 ,int Num3)
    {
     if(Num1 == Num2 && Num1 == Num3)
        {
            resul=" todos los valores son iguales";
        }
        else{
             if(Num1 == Num2)
                       {
                           resul =" los primeros valores son iguales ";
                       }
        else if(Num1 == Num3)
        {
             resul=" el primer valor y el ultimo son iguales ";  
        }
        else if(Num3==Num2)
        {
            resul=" el segundo valor y el tercero son iguales ";  
        }
        else{
        
        if(Num1 > Num2 && Num1 > Num3){
           resul =Num1+" Es el mayor de todos";
        }
        else if(Num2 > Num1 && Num2 > Num3){
            resul =Num2+" Es el mayor de todos";
        }
        else{
          resul =Num3+" Es el mayor de todos";
        }
        
        }
        }
     return resul;
    }

    
}
