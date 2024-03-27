
public class TraiterDate {
	private Date date;
	public TraiterDate(Date uneDate) {
		setDate(uneDate);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int toInt() {
		return (10000*getDate().getAnnee() + 100*getDate().getMois()+getDate().getJour());
	}
	
}
