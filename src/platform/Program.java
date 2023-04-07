package platform;

public class Program {
private int id;
private String title;
private int duration;
private String genre;
private int currentMinute;
public Program(int id,String title, int duration, String genre, int currentMinute ) {
	this.id=id;
	this.title=title;
	this.duration=duration;
	this.genre=genre;
	this.currentMinute=currentMinute;
	if (currentMinute<0||currentMinute>=duration) {
		throw new RuntimeException("Invalide time");
	}
}
public Program(int id,String title, int duration, String genre) {
	 this(id, title, duration, genre, 0);
}
public int getCurrentMinute() {
	return currentMinute;
}
public String getTitle() {
	return title;
}
public int getDuration() {
	return duration;
}
public int getID() {
	return id;
}
public String getGenre() {
	return genre;
}
public void setCurrentMinute(int currentMinute) {
	this.currentMinute = currentMinute;
	if(currentMinute<0||currentMinute>duration) {
		throw new RuntimeException("Invalide time");
	}	
}
public String toString() {
	return title+"Genre:"+genre+" "+"Duration:"+duration+" continue at:"+currentMinute;
	}
}