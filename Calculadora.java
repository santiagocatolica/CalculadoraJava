// Programa feito pelos alunos Santiago Fleitas e Matheus Ferreira.

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, multi, divi, op;
		
	// ------------------------------ TESTE -------------------------------------
		// Método que será executado antes dos testes
		@Before
		public void initTest() {
			// Instância do objeto
			calculadora = new Calculadora();
			// Valor Mockado
			  // Valor1
				num1 = 10;
			  // Valor2
				num2 = 2;
		};
		
		// Método de soma testado de forma unitária.
		@Test
		public void testAddittion() {
			// chamada do método de adição do meu objeto calculadora com valores mockados sendo passados como parâmetro.
			soma = calculadora.addittion(num1, num2);
			// verificação dos valores esperados com o valor retornado, arredondado
			assertEquals(12, result, 0.001);
		}
		
		
		// Método que será executado após os testes unitários
		@After
		public void afterTest() {
			calculadora = null;
		}
		
		// Escolhendo a operação
		System.out.println("Escolha uma operacao: ");
		System.out.println("1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao");
		op = in.nextDouble();
		if(op > 4 || op < 1){
			System.out.println("Opcao invalida, escolha um numero de 1 a 4");
		}
		
		// Escolhendo os números
		System.out.println("Insira um numero: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		// Processamento dos números e operações
		soma = num1 + num2;
		subtracao = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;
		
		// If's para resultados devido à escolha de operação feita pelo usuário
		if(op == 1){
			System.out.println("O resultado da soma sera: " + soma);
		} else if(op == 2){
			System.out.println("O resultado da subtracao sera: " + subtracao);
		} else if(op == 3){
			System.out.println("O resultado da multiplicacao sera: " + multi);
		} else if(op == 4){
			System.out.println("O resultado da divisao sera: " + divi);
		} else{
			System.out.println("Erro, digite outros valores");
		}
	}
}