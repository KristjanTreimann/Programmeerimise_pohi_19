package scraper.scraper;

public class App {

	public static void main(String[] args) {
		WebScraper sc = new WebScraper("https://www.postimees.ee/");
		sc.openScraper();
		sc.saveHTML();
		sc.closeScraper();
	}
}