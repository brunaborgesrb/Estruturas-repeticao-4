/*Programa para solicitar do usuário um número inteiros de 1 a 10 e calcular e exibir a
tabuada do número dado. OBS: O programa deve forçar que o número digitado esteja no intervalo de 1 a
10 */

Scanner input = new Scanner (System.in);
int num = 0, cont, tabuada;

System.out.println("informe um número inteiro de 1 a 10: ");
num = input.nextInt();
while (num < 1 || num > 10) {
    System.out.print("número inválido! informe um número de 1 a 10: ");
    num = input.nextInt();
}
for (cont = 1; cont <= 10; cont = cont +1) {
    tabuada = num*cont;
    System.out.println("tabuada: " + tabuada);
}

}
}
