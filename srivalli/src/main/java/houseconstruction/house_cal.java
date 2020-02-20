package houseconstruction;

public class house_cal {
	
	private double amount,area;
	String material_standard,fully_automated;
	
	public void setValues(double area,String material_standard,String fully_automated) {
		this.area=area;
		this.material_standard=material_standard;
		this.fully_automated=fully_automated;
	}
	
	public double gettotalamount() {
		if(fully_automated=="no") {
			if(material_standard=="standard") {
				amount=area*1200;
			}
			else if(material_standard=="above_standard") {
				amount=area*1500;
			}
			else {
				if(material_standard=="high_standard") {
					amount=area*1800;
				}
			}
		}
		else {
			if(material_standard=="high_standard" && fully_automated=="yes") {
				amount=area*2500;
			}
		}
		return amount;
	}

}
