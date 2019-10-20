package principal;

public class Times {
	private String time;
	private int qtdeMensao;
	
	public Times(String time, int qtdeMensao) {
		super();
		this.time = time;
		this.qtdeMensao = qtdeMensao;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public int getQtdeMensao() {
		return qtdeMensao;
	}
	
	public void setQtdeMensao(int qtdeMensao) {
		this.qtdeMensao = qtdeMensao;
	}


}
