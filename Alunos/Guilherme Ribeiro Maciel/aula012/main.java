package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class main {
	public static void main(String[] args) {
		Ativ1();
		Ativ2();
		Ativ3();
	}

	//ATV1
	private static void Ativ1() {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4,5 ,6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		List<Integer> pares = numeros.stream()
				.filter(num -> num % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(pares);
	}
	
	private static void Ativ2() {
		List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
		List<String> maiusculas = nomes.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(maiusculas);
	}

	private static void Ativ3() {
		List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
		Map<String, Long> contagem = palavras.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
		System.out.println(contagem);
	}
}
