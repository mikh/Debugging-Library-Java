package debugging;

import java.util.ArrayList;

public class Print {
	public static void print(ArrayList<ArrayList<String>> aas){
		for(int ii = 0; ii < aas.size(); ii++){
			for(int jj= 0; jj < aas.get(ii).size(); jj++){
				System.out.print(aas.get(ii).get(jj) + " \t ");
			}
			System.out.println(" ");
		}
	}
}
