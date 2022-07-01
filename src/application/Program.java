/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourseEmployee;

/**
 * @author Andre Francisco
 *
 */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//definindo o idioma
		Scanner sc = new Scanner(System.in);//inicializando o scanner para leitura de dados
		
		List<Employee> list = new ArrayList<>();//criando arrayList para armazenar dados dos funcion�rios
		
		System.out.print("Enter the numbers of employees: ");
		int n = sc.nextInt();//leitura da quantidade de funcion�rios
		
		for(int i = 1; i<=n; i++) {//(for para a leitura dos dados dos funcion�rios)
			System.out.println("Employee #"+i+" data: ");
			System.out.print("Outsourse (y/n)? ");
			char ch = sc.next().charAt(0);//guarda o resultado do (char) digitado para fazermos a compara��o se sim ou n�o
			System.out.print("Name: ");
			sc.nextLine();//consome a quebra de linha
			String name = sc.nextLine();//leitura do nome do funcion�rio
			System.out.print("Hours: ");
			int hours = sc.nextInt();//leitura das hora trabalhadas
			System.out.print("Value per Hour: ");
			double valuePerHour= sc.nextDouble();//leitura do valor por hora trabalhado
			if (ch == 'y') {//compara��o se � funcion�rio terceirizado ou n�o
				System.out.print("Additional charge: ");
				double additionaCharge = sc.nextDouble();//se for terceirizado faz a leittura do adicional
				//instanciando o objeto que vai receber os par�metros digitados acima
				Employee emp =new OutsourseEmployee(name, hours, valuePerHour, additionaCharge);
				list.add(emp);//guardando os dados na lista 
			} else {//se n�o � terceirizado...
				Employee emp = new Employee(name, hours, valuePerHour);//instancia o ojeto com os dados digitados sem o adicional
				list.add(emp);//guarda os dados na lista 
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {//(foreach) para impress�o dos dados da lista
			//para cada empregado (emp) da minha lista
			//imprime o nome e o pagamento
			System.out.println(emp.getName() + " - $"+ String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
	

}
