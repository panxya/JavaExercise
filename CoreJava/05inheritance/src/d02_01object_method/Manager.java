package d02_01object_method;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}
	public double getSalary(double bonus) {
		double baseSalary = super.getSalary();
		return baseSalary+bonus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
