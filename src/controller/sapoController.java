package controller;

import java.util.Random;

public class sapoController extends Thread {
   String sapo = " ";
   int salto =0;
   int distancia =0;
   Random setsalto = new Random(); 
   int colocacao = 1;
   public sapoController (String nome) {
	  this.sapo = nome; 
   }
	
   
   public void run() {
	   while(distancia < 10) {
	   salto = setsalto.nextInt(3);
	   distancia += salto;
	   System.out.println(sapo + " salto " + salto + " distancia ate o momento:" + distancia);
	   }
	System.out.println(sapo + " terminou a corrida");   
   
   }
    
}
