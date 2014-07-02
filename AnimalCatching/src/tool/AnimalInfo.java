package tool;

public class AnimalInfo {

	private static String anameth;
	private static String anameen;
	private static String anamesci;
	private static String adetail;
	private static String aimage;
	private static String icon;
	private static String lat;
	private static String lng;
	
	
	private void setanameth(String anameth){
		this.anameth = anameth;
	}
	
	private void setanameen(String anameen){
		this.anameen = anameen;
	}
	
	private void setLat(String lat){
		this.lat = lat;
	}
	
	private void setLng(String lng){
		this.lng = lng;
	}
	
	private void setanamesci(String anamesci){
		this.anamesci = anamesci;
	}
	
	private void setadetail(String adetail){
		this.adetail = adetail;
	}
	
	private void setaimage(String aimage){
		this.aimage = aimage;
	}
	
	private void seticon(String icon){
		this.icon = icon;
	}
	
	public String getanameth(){
		return anameth;
	}
	
	public String getanameen(){
		return anameen;
	}
	
	public String getanamesci(){
		return anamesci;
	}
	
	public String getadetail(){
		return adetail;
	}
	
	public String getimage(){
		return aimage;
	}
	
	public String geticon(){
		return icon;
	}
	
	public String getLat(){
		return aimage;
	}
	
	public String getLng(){
		return icon;
	}
	
	public AnimalInfo Create(String anameth,String anameen, String anamesci, String adetail, String aimage,String icon,String lat,String lng){
		AnimalInfo output = new AnimalInfo();
		output.setanameth(anameth);
		output.setanameen(anameen);
		output.setanamesci(anamesci);
		output.setadetail(adetail);
		output.setaimage(aimage);
		output.seticon(icon);
		output.setLat(lat);
		output.setLng(lng);
		return output;
		
	}
}
