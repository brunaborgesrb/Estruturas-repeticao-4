/*Programa para solicitar ao usuário que informe o sexo e a altura de um grupo de
pessoas. A quantidade de pessoas do grupo deve ser informada pelo usuário no início do programa. O
programa deve forçar que esta quantidade seja maior ou igual a 1. O programa deve calcular:
  A altura média das mulheres e a altura média dos homens;
  A maior e a menor altura do grupo, dizendo se a altura é de um homem ou de uma mulher.
OBS: Os valores válidos para o sexo são ‘M’, ‘m’, ‘F’ ou ‘f’. Os valores válidos para altura são de 0,5 a 2,0
(inclusive). O programa deve forçar a digitação de valores válidos para sexo e altura. */

Scanner input = new Scanner (System.in);
   	 int qtdPessoas, cont;
   	 char sexo;
   	 double altura = 0, contAlturaM = 0, mediaAlturaM, contAlturaF =0, mediaAlturaF, menorAltura=0, maiorAltura=0;
   	 System.out.println("informe a quantidade de pessoas do grupo:");
    	qtdPessoas = input.nextInt();
    	while (qtdPessoas < 1) {
        	System.out.print("quantidade inválida. informe valor maior que zero:");
        	qtdPessoas = input.nextInt();
    	}
    	for (cont = 1; cont <= qtdPessoas; cont = cont+1){
   		 System.out.println("informe sua altura: ");
   		 altura = input.nextDouble();
   		 while (altura < 0.5 || altura > 2.0) {
   			 System.out.print("altura inválida! digite a altura de 0.5 a 2.0");
   			 altura = input.nextDouble();
   		 }
   		 System.out.println("informe seu sexo (M ou F): ");
   		 sexo = input.next().charAt(0);
   		 sexo = Character.toUpperCase(sexo);
   		 while (sexo != 'M' && sexo != 'F') {
   			 System.out.print("gênero inválido! informe M ou F");
   			 sexo = input.next().charAt(0);
   			 sexo = Character.toUpperCase(sexo);
   		 }
   		 if (altura == 'M') {
   			 contAlturaM = contAlturaM +1;
   		 }
   		 if (altura == 'F') {
   			 contAlturaF = contAlturaF +1;
   		 }
   		 if (maiorAltura > altura) {
   			 maiorAltura = altura;
   		 }
   		 if (menorAltura < altura) {
   			 menorAltura = altura;
   		 }
   		 
   		 
 
    }//fim do for
    	if (altura != 0) {
 mediaAlturaM = contAlturaM / qtdPessoas;
System.out.println("a altura média dos homens é : " + mediaAlturaM);
    	}
    	if (altura != 0) {
mediaAlturaF = contAlturaF / qtdPessoas;
System.out.println("a altura média das mulheres é : " + mediaAlturaF);
    	}
    	if (altura != 0) {
System.out.println("a maior altura é: " + maiorAltura);
    	}
    	if (altura != 0) {
System.out.println("a menor altura é: " + menorAltura);
    	}

}
