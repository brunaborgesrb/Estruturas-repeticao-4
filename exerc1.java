/*Programa para calcular e exibir a soma dos N primeiros números inteiros maiores que
zero, onde N (quantidade de números a serem somados) é um valor informado pelo usuário. */

Scanner input = new Scanner (System.in);
   	 int num1, num2, num3, num4, num5;
   	 double soma;
   	 System.out.print("informe o primeiro numero: ");
   	 num1 = input.nextInt();
   	 System.out.print("informe o segundo numero: ");
   	 num2 = input.nextInt();
   	 System.out.print("informe o terceiro numero: ");
   	 num3 = input.nextInt();
   	 System.out.print("informe o quarto numero: ");
   	 num4 = input.nextInt();
   	 System.out.print("informe o quinto numero: ");
   	 num5 = input.nextInt();
   	 
   	 soma = num1+num2+num3+num4+num5;
   	 
   	 System.out.print("soma: " + soma);
    	}

}

