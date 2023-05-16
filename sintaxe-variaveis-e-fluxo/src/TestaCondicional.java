
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("já pode ser preso");
		} else {
			if (quantidadePessoas >=2) {
				System.out.println("nao tem 18, mas pode entrar");
			} else {
			System.out.println("não pode entrar");
			}
		}
	}
}
