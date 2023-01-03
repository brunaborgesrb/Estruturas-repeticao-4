/*A sequência abaixo é conhecida como série de Fibonacci. A série de Fibonacci tem aplicações na
análise de mercados financeiros, na ciência da computação e na teoria dos jogos. Também aparece em
configurações biológicas, como, por exemplo, na disposição dos galhos das árvores. Implemente um
programa para escrever esta série até o seu trigésimo termo.
Série de Fibonacci: 1,1,2,3,5,8,13,21,34,55,... */

Scanner input = new Scanner (System.in);
   	 int n1 = 1;
    	int n2 = 0;
   	 
        	 
    	for (int i = 1; i <= 30; i++){
      	if (i < 2){
         	 
          	System.out.println(1);
         	 
      	} else {
        	n1 = n1 + n2;
        	n2 = n1 - n2;
      	 
   	 
    	System.out.println(n1);
      	}
    	}
    	}

}
