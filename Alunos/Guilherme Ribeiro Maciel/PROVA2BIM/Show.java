package MySeries;

import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Show {
	//ArrayList<Show> show = new ArrayList<>();
		String name;
		String language;
		ArrayList<String> genres = new ArrayList<>();
		//ArrayList<Rating> rating = new ArrayList<>();
		float average;
		String status;
		LocalDate premiered;
		LocalDate ended;
		//ArrayList<Network> network = new ArrayList<>();
		@JsonProperty("network.name")
		String emissora;

	public Show() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public ArrayList<String> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getPremiered() {
		return premiered;
	}

	public void setPremiered(LocalDate premiered) {
		this.premiered = premiered;
	}

	public LocalDate getEnded() {
		return ended;
	}

	public void setEnded(LocalDate ended) {
		this.ended = ended;
	}
	
	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getEmissora() {
		return emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}
}
