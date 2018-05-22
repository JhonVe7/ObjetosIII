package proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comandos {
	public static void exec (String cmd) {
		try {
			Runtime.getRuntime().exec(cmd);
		}catch(IOException e){
			System.out.println("Failed");
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cases;
		System.out.println("desea apagar el pc Yes/No");
		cases = br.readLine();
		switch(cases){
		case "yes":
			exec("shutdonw -s -t 20");
		case "No":
			break;
		}
	}
}
