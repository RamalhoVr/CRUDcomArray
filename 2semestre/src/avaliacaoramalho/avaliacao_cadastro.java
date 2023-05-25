/*
 * Por: Victor Ramalho | github.com/RamalhoVr
 * feito em 27/09/2022
 * CRUDcomArray.java
 * */

package avaliacaoramalho;
																						
import javax.swing.JOptionPane;

//insert de quantidade de pessoas que irão participar no cadastro
public class avaliacao_cadastro {
	static int x = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão ser cadastradas? "));
	public static String[][] pessoa = new String [x][3];

//Controlador
public static void menu(){
	int op;
	do {
	op = Integer.parseInt(JOptionPane.showInputDialog("===Menu=== \n"
			+ "1- Cadastrar \n"
			+ "2- Mostrar dados \n"
			+ "3- Excluir Dados \n"
			+ "4- Sair"));
			
		switch(op){
		
		case 1: 
		cadastros();
		
		case 2:
		mostrar();
		
		case 3:
		excluir();
		
		case 4:
		break;
		
		default:
		JOptionPane.showMessageDialog(null, "Incorreto! Coloque um dos quatros valores");
		menu();
		
		
		}
	}while(op != 4);
	
}

	//Cadastro
	public static void cadastros() {	
		
		
	JOptionPane.showMessageDialog(null, "Vamos colocar seus dados!");
		for(int l=0;l<x;l++) {
			pessoa[l][0]= JOptionPane.showInputDialog("Coloque seu Nome: ");
			pessoa[l][1]= JOptionPane.showInputDialog("Coloque seu Telefone: ");
			pessoa[l][2]= JOptionPane.showInputDialog("Coloque seu RG: ");
				
			}
	menu();
	}

	//print
	public static void mostrar(){
		
		for(int l=0;l<x;l++) {
			JOptionPane.showMessageDialog(null,"Seu nome é: " + pessoa[l][0]+" seu telefone é:  "+pessoa[l][1]+" e seu rg é:  "+pessoa[l][2]);
		}
		menu();
	}		
	
	//delete
	public static void excluir() {
	
	int l = Integer.parseInt(JOptionPane.showInputDialog("Insira qual linha deseja apagar:"));
	l = l-1;
	pessoa[l][0] = " ";
	pessoa[l][1] = " ";
	pessoa[l][2] = " ";
	menu();
	}
	
	//executa a função de controle
	public static void main(String[] args) {
		menu();
		
	

	}

}

