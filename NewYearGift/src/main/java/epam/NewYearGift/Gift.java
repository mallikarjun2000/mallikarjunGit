package epam.NewYearGift;

import epam.NewYearGift.CoffeByte;
import epam.NewYearGift.Gift;
import epam.NewYearGift.MangoByte;

public class Gift {
	String name ="";
	double totalWeight=0.0;
	Gift(String name, int x, int y)
	{
		this.name = name;
		CoffeByte c[] = new CoffeByte[x];
		MangoByte m[] = new MangoByte[y];
		double total = 0;
		for(CoffeByte i : c)
		{
			total += i.getWeight();
		}
		for(MangoByte j : m)
		{
			total += j.getWeight();
		}
		this.totalWeight = total;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the totalWeight
	 */
	public double getTotalWeight() {
		return totalWeight;
	}
	/**
	 * @param totalWeight the totalWeight to set
	 */
	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}
	public int compareTo(Gift o) {
		// TODO Auto-generated method stub
		return (int)(o.totalWeight);
	}
}
