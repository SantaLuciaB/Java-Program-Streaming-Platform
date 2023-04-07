package platform;
import java.util.ArrayList;
public class Favorites {
private ArrayList<Program> programs;
/* Constructs a new Favorites object with 
an empty list of programs.*/
public Favorites() {
		this.programs=new ArrayList<>();
	}
/* Adds a new program to the list of favorites. 
 * If a program with the same ID already exists, 
 * it is replaced.
 */	
public void newProgram(Program program) {
	int programID=program.getID();
		for(int i=0;i<programs.size();i++) {
		  if(programs.get(i).getID()==programID) {
			programs.set(i,program);
			return;
		}
	}
		programs.add(program);
}
/*Updates the current minute of a program with the
 *  specified ID. */
public void updateProgram(int ID,int minutes) {
	for (Program program:programs) {
		if(program.getID()==ID) {
			program.setCurrentMinute(minutes);
			}
		}
	}
/* Returns the current minute of a program with the 
 * specified ID. */
public int currentMinute(int ID) {
	for (Program program:programs) {
		if(program.getID()==ID) {
			return program.getCurrentMinute();
		}
	}
		return -1;
}
public Program showProgram(int ID) {
	for (Program program:programs) {
		if(program.getID()==ID) {
			return program;
		}
}
	throw new RuntimeException(" Error to found program");
	}
public boolean deleteProgram(int ID) {
	for (int i=0;i<programs.size();i++) {
		if (programs.get(i).getID()==ID) {
			programs.remove(i);
				return true;
		}
	}
		        return false;
}
@Override
public String toString() {
		StringBuilder sb = new StringBuilder();//flexible way to concatenate strings
        sb.append("[");
        for (int i = 0; i < programs.size(); i++) {
            sb.append(programs.get(i).toString());
            
            if (i != programs.size() - 1) {
                sb.append(",");
                sb.append("\n");
            }
        }
        sb.append("]");
        return sb.toString();
	}
}

