package pila;
import java.util.*;
public class PILA {
   public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   //declaramos una variable tipo char para los caracteres y dos de tipo int una para la pila y otra para la opcion
   char x='a';
   int opt=0, opcion;
   //creamos la pila de tamaño 27
   char pila[] = new char [27];
   //iniciamos un do 
   do{
       //imprimimos el menu
       System.out.println("----------ABECEDARIO----------");
       System.out.println("1-Llenar\n" + "2-Mostrar\n" + "3-Eliminar\n" + "4-Agregar\n" +  "Opcion :  \n");
       switch(opcion=sc.nextInt()){
           //el caso numero uno realiza lo que es llenar la pila
           case 1:
               System.out.println("----------ABECEDARIO----------");
                   while (x<='z'){
                   pila [opt]=x;
                   System.out.println(pila[opt]);
                   opt++;
                   x++;
               }
                   System.out.println("Pila llena\n");
          break;
          //el caso numero dos permite visualisar la pila iniciando desde la z hasta la a
           case 2:
               System.out.println("----------ABECEDARIO----------");
               System.out.println("Elementos de la pila");
                 for (int i= opt-1; i>=0; i--) {
                 System.out.println(pila[i]);
                        }
               break;
            //el caso numero tres realiza lo que es eliminar las letras una por una
           case 3:
               if(opt!=0){
               System.out.println("----------ABECEDARIO----------");
               System.out.println("Eliminando la letra");
               opt--;}
           break;
           //el caso numero cuatro agrega las letras que el usuario decida 
           case 4:
               System.out.println("----------ABECEDARIO----------");
               System.out.println("Agregar letras, por favor introduce la nueva letra para la pila \n");
               pila[opt]=sc.next().charAt(0);
               opt++;
       }
   }while (opt !=4);
   }
}
