package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String linha = null;
		String tweet = null;
		int countFlamengo = 0;
		int countPalmeiras = 0;
		int countSantos = 0;
		int countCorinthians = 0;
		int countSaoPaulo = 0;
		int countSCInternacional = 0;
		int countGremio = 0;
		int countECBahia = 0;
		int countAthleticoPR = 0;
		int countGoiasoficial = 0;
		int countVascodaGama = 0;
		int countAtletico = 0;
		int countFortalezaEC = 0;
		int countBotafogo = 0;
		int countFluminenseFC = 0;
		int countCruzeiro = 0;
		int countCearaSC = 0;
		int countCSAoficial = 0;
		int countAvai = 0;
		int countChapecoenseReal = 0;
		
		ArrayList<Times> aTimes = new ArrayList<Times>();

		/* Le o Arquivo e faz a inclusão nos objetos */
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\Duda\\git\\TwitterApiJson\\TwitterApiJson\\src\\files\\twitter.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ((linha = reader.readLine()) != null) {
				tweet = linha.substring(104, 385).trim();
				
				//Conta as mensões de cada time.
				if (tweet.contains("Flamengo")) {
					countFlamengo++;
				}
				if (tweet.contains("Palmeiras")) {
					countPalmeiras++;
				}
				if (tweet.contains("Santos")) {
					countSantos++;
				}
				if (tweet.contains("Corinthians")) {
					countCorinthians++;
				}
				if (tweet.contains("SaoPaulo")) {
					countSaoPaulo++;
				}
				if (tweet.contains("SCInternacional")) {
					countSCInternacional++;
				}
				if (tweet.contains("Gremio")) {
					countGremio++;
				}
				if (tweet.contains("ECBahia")) {
					countECBahia++;
				}
				if (tweet.contains("AthleticoPR")) {
					countAthleticoPR++;
				}
				if (tweet.contains("goiasoficial")) {
					countGoiasoficial++;
				}
				if (tweet.contains("VascodaGama")) {
					countVascodaGama++;
				}
				if (tweet.contains("Atletico")) {
					countAtletico++;
				}
				if (tweet.contains("FortalezaEC")) {
					countFortalezaEC++;
				}
				if (tweet.contains("botafogo")) {
					countBotafogo++;
				}
				if (tweet.contains("FluminenseFC")) {
					countFluminenseFC++;
				}
				if (tweet.contains("Cruzeiro")) {
					countCruzeiro++;
				}
				if (tweet.contains("CearaSC")) {
					countCearaSC++;
				}
				if (tweet.contains("CSAoficial")) {
					countCSAoficial++;
				}
				if (tweet.contains("Avai")) {
					countAvai++;
				}
				if (tweet.contains("ChapecoenseReal")) {
					countChapecoenseReal++;
				}
			}
			
			//Cria os objetos de times e adiconar no vetor.
			Times timeFlamengo = new Times("Flamengo",countFlamengo);
			aTimes.add(timeFlamengo);
			
			Times timePalmeiras = new Times("Palmeiras",countPalmeiras);
			aTimes.add(timePalmeiras);
			
			Times timeSantos = new Times("Santos",countSantos);
			aTimes.add(timeSantos);
			
			Times timeCorinthians = new Times("Corinthians",countCorinthians);
			aTimes.add(timeCorinthians);
			
			Times timeSaoPaulo = new Times("SaoPaulo",countSaoPaulo);
			aTimes.add(timeSaoPaulo);
			
			Times timeInternacional = new Times("Internacional",countSCInternacional);
			aTimes.add(timeInternacional);
			
			Times timeGremio = new Times("Gremio",countGremio);
			aTimes.add(timeGremio);
			
			Times timeBahia = new Times("Bahia",countECBahia);
			aTimes.add(timeBahia);
			
			Times timeAthleticoPR = new Times("Athletico PR",countAthleticoPR);
			aTimes.add(timeAthleticoPR);

			Times timeGoias = new Times("Goias",countGoiasoficial);
			aTimes.add(timeGoias);
			
			Times timeVascodaGama = new Times("Vasco da Gama",countVascodaGama);
			aTimes.add(timeVascodaGama);
			
			Times timeAtletico= new Times("Atletico",countAtletico);
			aTimes.add(timeAtletico);
			
			Times timeFortaleza = new Times("Fortaleza",countFortalezaEC);
			aTimes.add(timeVascodaGama);
			
			Times timeBotafogo = new Times("Botafogo",countBotafogo);
			aTimes.add(timeBotafogo);
			
			Times timeFluminense = new Times("Fluminense",countFluminenseFC);
			aTimes.add(timeFluminense);
			
			Times timeCruzeiro = new Times("Cruzeiro",countCruzeiro);
			aTimes.add(timeCruzeiro);
			
			Times timeCeara = new Times("Ceara",countCearaSC);
			aTimes.add(timeCeara);
			
			Times timeCSA= new Times("CSA",countCSAoficial);
			aTimes.add(timeCSA);
			
			Times timeAvai = new Times("Avai",countAvai);
			aTimes.add(timeAvai);
			
			Times timeChapecoense = new Times("Chapecoense",countChapecoenseReal);
			aTimes.add(timeChapecoense);
			
			OrdenaArquivo(aTimes);
			ImprimeADados(aTimes);

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void OrdenaArquivo(ArrayList<Times> aTimes) {
		int i, j;

		/* Variaveis Temporárias */
		String tempTime = null;
		int    tempQtdeMensao = 0;
		

		for (i = 0; i < aTimes.size() - 1; i++) {
			for (j = 0; j < aTimes.size() - 1; j++) {
				if (aTimes.get(j).getQtdeMensao() < aTimes.get(j + 1).getQtdeMensao()) {
					
					tempTime = aTimes.get(j).getTime();
					tempQtdeMensao = aTimes.get(j).getQtdeMensao();

					aTimes.get(j).setTime(aTimes.get(j + 1).getTime());
					aTimes.get(j).setQtdeMensao(aTimes.get(j + 1).getQtdeMensao());

					aTimes.get(j + 1).setTime(tempTime);
					aTimes.get(j + 1).setQtdeMensao(tempQtdeMensao);					
				}
			}
		}

	}
	
	public static void ImprimeADados(ArrayList<Times> aTimes) {
		System.out.println("Hipótese: Qual é o time mais mencionado no Twitter da Série A do campeonto Brasileiro ?");
		System.out.println("Resposta: O Time mais mencionado é o time " + aTimes.get(0).getTime() + " com " + aTimes.get(0).getQtdeMensao() + " mensões. \n");
		
		System.out.println("-- Dados da análise --");
		for (Times dados : aTimes) {
			System.out.println("Time: " + dados.getTime() + " - Qtde mensões: " + dados.getQtdeMensao());
		}
		
		System.out.println("\nHashtags pesquisadas: #CampeonatoDoBrasileiro, #Brasileirao");

	}


}
