package view;

import controller.sapoController;

public class CorridaSapos {

	public static void main(String[] args) {
	
		sapoController sapo1 = new sapoController("sapo 1");
		sapoController sapo2 = new sapoController("sapo 2");
		sapoController sapo3 = new sapoController("sapo 3");
		sapoController sapo4 = new sapoController("sapo 4");
		sapoController sapo5 = new sapoController("sapo 5");
		
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}

}
