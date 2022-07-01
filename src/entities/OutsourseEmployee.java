/*Classe dos empregados terceirizados
 * com variável construtores, gets e sets
 * e função que retorna o valor das horas trabalhadas acrescido ao adicional de 110%*/
package entities;

public class OutsourseEmployee extends Employee{
	
	private Double additionalCharge;

	public OutsourseEmployee() {
		super();
	}

	public OutsourseEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
