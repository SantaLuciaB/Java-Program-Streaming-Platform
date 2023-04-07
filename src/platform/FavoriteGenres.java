package platform;
import java.util.ArrayList;

public class FavoriteGenres extends Favorites {
private ArrayList<String>genres;
public FavoriteGenres(String[]genreNames) {
	this.genres=new ArrayList<>();
	for(String genreName:genreNames) {
	this.genres.add(genreName);
	}
}
@Override
public void newProgram(Program program) {
	String programGenre= program.getGenre();
	for (String genre:genres) {
		if(genre.equals(programGenre)) {
			super.newProgram(program);
	return;
	}
		}
	 throw new RuntimeException("Not favorite genre");
	}
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append("[");
	for(int i=0;i<genres.size(); i++) {
	    sb.append(genres.get(i));
		if(i!=genres.size()-1) {
			sb.append(",");
		}
	}
	sb.append("]\n");
	sb.append(super.toString());
	return sb.toString();
}
}

