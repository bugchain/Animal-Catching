package tool;

public class AnimalMapInfo {

	private static int aid;
	private static String aname;
	private static double lattitude;
	private static double longtitude;
	private static String icon;
	private static String bg;
	private static String time;
	
	public AnimalMapInfo() {
		// TODO Auto-generated constructor stub
	}
	
	private void setAid(int aid){
		this.aid = aid;
	}
	
	public int getAid(){
		return this.aid;
	}
	
	private void setAname(String aname){
		this.aname = aname;
	}
	
	public String getAname(){
		return aname;
	}
	
	private void setLattitude(double lattitude){
		this.lattitude = lattitude;
	}
	
	public double getLattitude(){
		return lattitude;
	}
	
	private void setLongtitude(double longtitude){
		this.longtitude = longtitude;
	}
	
	public double getLongtitude(){
		return longtitude;
	}
	
	private void setIcon(String icon){
		this.icon = icon;
	}
	
	private void setBackground(String bg){
		this.bg = bg;
	}
	private void setTime(String time){
		this.time = time;
	}
	
	public AnimalMapInfo Create(int aid,String aname, double lattitude, double longtitude, String icon){
		AnimalMapInfo output = new AnimalMapInfo();
		output.setAid(aid);
		output.setAname(aname);
		output.setIcon(icon);
		output.setLattitude(lattitude);
		output.setLongtitude(longtitude);
		return output;
		
	}
	
}
