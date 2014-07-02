package tool;

public class AnimalCatchedInfo {
 
	private static int aid;
	private static String aname;
	private static String aicon;
	
	private void setaid(int aid){
		this.aid = aid;
	}
	
	private void setaname(String aname){
		this.aname = aname;
	}
	
	private void setaicon(String aicon){
		this.aicon = aicon;
	}
	
	public int getaid(){
		return aid;
	}
	
	public String getaname(){
		return aname;
	}
	
	public String getaicon(){
		return aicon;
	}
	
	public AnimalCatchedInfo Create(int aid,String aname, String aicon){
		AnimalCatchedInfo output = new AnimalCatchedInfo();
		output.setaid(aid);
		output.setaname(aname);
		output.setaicon(aicon);
		return output;
	}
	
}
