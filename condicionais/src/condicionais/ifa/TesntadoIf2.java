package condicionais.ifa;

public class TesntadoIf2 {

	public static void main(String[] args) {
		
		int idade = 18;
		int quantidadePessoas = 2;
		
		boolean acompanhado = true;
		
		if(idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmnete você não pode entrar.");
		}
		
		if(idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmnete você não pode entrar.");
		}
		
		if(idade >= 18 && acompanhado == true) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmnete você não pode entrar.");
		}
	}

}
