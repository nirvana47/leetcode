
public class SolutionJudgeCircle {
	public boolean judgeCircle(String moves) {
		
		if(moves.length() % 2 == 1) return false;
		
		String[] robot = moves.split("");
		
		// System.out.println(robot[0] + /* robot[1]+ " " +*/ robot.length + " " + moves.length());
		
		int countR=0, countU=0, countD=0, countL=0,i=0;
		
		// Check to see that all the input are valid values
		for (i = 0; i < moves.length(); i++) {
			
			// System.out.println(robot[i]);
			
			if(robot[i].equals("R")) {countR++; }
			else if(robot[i].equals("U")) { countU++;}
			else if(robot[i].equals("D")) { countD++; }
			else if(robot[i].equals("L")) { countL++; }
			else { return false; }
		}
		
		// System.out.println(countR + " " + countU + " " + countD + " " + countL);
		
		if(countR == countL && countU == countD) return true;
		else return false;
	}
	
	 public static void main(String[] args) {
		 SolutionJudgeCircle SJC = new SolutionJudgeCircle();
		 boolean s = SJC.judgeCircle("LRTDDD");
		 System.out.println(s);
	}

}
