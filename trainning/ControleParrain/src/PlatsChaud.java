
public class PlatsChaud extends PlatsFroid {

	private int tempsCuison;
	public PlatsChaud(String name, int time, int timeConf,int timeCuison) {
		super(name, time, timeConf);//
		this.setTempsCuison(timeCuison);
	}
	public int getTempsCuison() {
		return tempsCuison;
	}
	public void setTempsCuison(int tempsCuison) {
		this.tempsCuison = tempsCuison;
	}
	public int getTempsGlobale() {
		return super.getTempsGlobal()+getTempsCuison();
	}
	public boolean equals(PlatsChaud unPlatChaud) {
		if(super.equals(unPlatChaud)&&
				unPlatChaud.getTempsCuison()==getTempsCuison()) {
			return true;
		}
		return false;
	}
	public String toString() {
		return super.toString()+" le temps de cuison est "+String.valueOf(getTempsCuison()) ;
	}
}
