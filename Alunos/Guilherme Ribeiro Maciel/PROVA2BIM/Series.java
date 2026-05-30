package MySeries;

import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Series extends Show {
	

	public Series() {
		
	}
	
	public String resumo() {
		return "Nome: " + name + ", Idioma: " + language + ", Genero: " + genres + ", Avaliação: " + average + ", Status: " + status
				+ ", Data de Estreia: " + premiered + ", Data de Encerramento:" + ended + ", Emissora: " + emissora;
		
	}
}
