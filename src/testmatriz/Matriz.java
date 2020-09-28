
package testmatriz;


public class Matriz {

    public void armar(){
      int contador=3;
      int matriz[][]= new int[4][];
      
      matriz[0]= new int[4];
      matriz[1]= new int[3];
      matriz[2]= new int[5];
      matriz[3]= new int[2];
      
      for(int i=0;i<4;i++){
           for(int x=0;x<matriz[i].length;x++){     
                matriz[i][x]=contador;
                contador+=3;
           }
      }
      
      for(int i=0;i<4;i++){
          System.out.print("Fila "+(i+1)+": ");
          for(int x=0;x<matriz[i].length;x++){
              if(matriz[i][x] % 2 == 0)
                 System.out.print(matriz[i][x]+" ");
          }
          System.out.print("\n");
      } 
    }
      
}
