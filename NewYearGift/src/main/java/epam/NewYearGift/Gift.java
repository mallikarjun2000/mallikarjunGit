package epam.NewYearGift;

import epam.NewYearGift.CoffeByte;
import epam.NewYearGift.Gift;
import epam.NewYearGift.MangoByte;

public class Gift {
	String name ="";
	int totalWeight=0;
	Gift(String name, int x, int y)
	{
		this.name = name;
		CoffeByte c = new CoffeByte();
		MangoByte m = new MangoByte();
		this.totalWeight = (int)c.getWeight()*(int)x + (int)m.getWeight()*(int)y ;
	}
	
	public String toString(){
		 return (name+" "+totalWeight);
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
	public int getTotalWeight() {
		return totalWeight;
	}
	/**
	 * @param totalWeight the totalWeight to set
	 */
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	public int compareTo(Gift o) {
		// TODO Auto-generated method stub
		return (int)(o.totalWeight);
	}
}
