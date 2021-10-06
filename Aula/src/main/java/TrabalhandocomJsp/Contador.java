package TrabalhandocomJsp;

import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;


public class Contador {
	
	private static int contagem;
	static ArrayList<String> datas = new ArrayList<>();
	
	public static void novoAcesso() {
		
		contagem += 1;
	}
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
	public static Object getDataInicial() {
		return datas.get(0);
	}
	
	
	public static String getDateTime() {
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		datas.add(dateFormat.format(date));
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) {
		Contador.novoAcesso();
	}

}
