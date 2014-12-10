import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;


public class Game {

	private Random r = new Random();
	private int correctColor1;
	private int correctColor2;
	private int correctColor3;
	private int correctColor4;
	private Color colors[] = new Color[4];
	private Color correctColors[] = new Color[4];
	private String labelArray[] = {"X", "X", "X", "X"};
	//private Color brown = new Color(139,69,19);
	private String playerName;
	private int numGames;
	private int currentGame = 0;
	private int numWins;
	private int numCWP;
	

	private int restartPoint=0;
	
	public void incrementCurrentGame(){
		currentGame += 1;
	}
	
	public int getCurrentGame() {
		return currentGame;
	}
	public void setCurrentGame(int currentGame) {
		this.currentGame = currentGame;
	}
	public int getNumWins() {
		return numWins;
	}
	public void incrementNumWins() {
		numWins += 1;
	}
	public int getNumGames() {
		return numGames;
	}
	public void setNumGames(int numGames) {
		this.numGames = numGames;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Game(){
		
		correctColor1 = r.nextInt(7);
		correctColor2 = r.nextInt(7);
		correctColor3 = r.nextInt(7);
		correctColor4 = r.nextInt(7);
		
		
		setCorrectColorArray(correctColor1, 0);
		setCorrectColorArray(correctColor2, 1);
		setCorrectColorArray(correctColor3, 2);
		setCorrectColorArray(correctColor4, 3);
		
		
	}
	
	public void setCorrectColors(){
	
		correctColor1 = r.nextInt(7);
		correctColor2 = r.nextInt(7);
		correctColor3 = r.nextInt(7);
		correctColor4 = r.nextInt(7);
		
		
		setCorrectColorArray(correctColor1, 0);
		setCorrectColorArray(correctColor2, 1);
		setCorrectColorArray(correctColor3, 2);
		setCorrectColorArray(correctColor4, 3);
	}
	
	public void setColorArray(JButton btn1, JButton btn2, JButton btn3, JButton btn4){
		colors[0] = btn1.getBackground();
		colors[1] = btn2.getBackground();
		colors[2] = btn3.getBackground();
		colors[3] = btn4.getBackground();
	}
	public void setCorrectColorArray(int color, int index){
		
		switch(color){
		case 0:
			correctColors[index] = Color.RED;
			break;
		case 1:
			correctColors[index] = Color.GREEN;
			break;
		case 2:
			correctColors[index] = Color.BLUE;
			break;
		case 3:
			correctColors[index] = Color.YELLOW;
			break;
		case 4:
			correctColors[index] = Color.PINK;
			break;
		case 5:
			correctColors[index] = Color.ORANGE;
			break;
		case 6:
			correctColors[index] = Color.BLACK;
			break;
		case 7:
			correctColors[index] = Color.WHITE;
			break;
		}
	}
	
	public String[] checkGuess(){
		int gCol1=0;
		 int gCol2=0;
		 int gCol3=0;
		 int gCol4=0;
		 int gCol5=0;
		 int gCol6=0;
		 int gCol7=0;
		 int gCol8=0;
		
		 int aCol1=0;
		 int aCol2=0;
		int aCol3=0;
		int aCol4=0;
		int aCol5=0;
		int aCol6=0;
		int aCol7=0;
		int aCol8=0;
		int numO=0;
		System.out.println(correctColors[0]);
		System.out.println(correctColors[1]);
		System.out.println(correctColors[2]);
		System.out.println(correctColors[3]);
		for (int i = 0; i < 4; i++){

			labelArray[i] = "X";

			
		}
		int pos=0;
		for (int i = 0; i < 4; i++){
			if(colors[i]==correctColors[i]){
			labelArray[pos] = "O";
			pos++;
			numO++;
			restartPoint=pos;
			}
		}
		
		for(int i=0;i<4;i++){

			if(correctColors[i]==Color.RED)
				aCol1++;
			if(correctColors[i]==Color.GREEN)
				aCol2++;
			if(correctColors[i]==Color.BLUE)
				aCol3++;
			if(correctColors[i]== Color.PINK)
				aCol4++;
			if(correctColors[i]==Color.YELLOW)
				aCol5++;
			if(correctColors[i]==Color.ORANGE)
				aCol6++;
			if(correctColors[i]==Color.BLACK)
				aCol7++;
			if(correctColors[i]==Color.WHITE)
				aCol8++;
			}
			
		for(int i=0;i<4;i++){

			if(colors[i]==Color.RED)
				gCol1++;
			if(colors[i]==Color.GREEN)
				gCol2++;
			if(colors[i]==Color.BLUE)
				gCol3++;
			if(colors[i]== Color.PINK)
				gCol4++;
			if(colors[i]==Color.YELLOW)
				gCol5++;
			if(colors[i]==Color.ORANGE)
				gCol6++;
			if(colors[i]==Color.BLACK)
				gCol7++;
			if(colors[i]==Color.WHITE)
				gCol8++;
			}
		
		int totalCorrectish = Math.min(gCol1, aCol1) + Math.min(gCol2, aCol2) + Math.min(gCol3, aCol3) + Math.min(gCol4, aCol4) +
				Math.min(gCol5, aCol5) + Math.min(gCol6, aCol6) + Math.min(gCol7, aCol7) +Math.min(gCol8, aCol8);
		
		int totalCWP = totalCorrectish-numO;
			
		for(int i=restartPoint;i<totalCWP;i++){
			labelArray[i]="!";
		}
		
		
		
		
		
//		for(int x = 0; x < 4; x++){
//			for(int y = x; y < 4; y++){
//				if(colors[x] == correctColors[y]){
//					if( x == y){
//						labelArray[x] = "O";
//						break;
//					}
//					
//					else{
//						labelArray[x] = "!";
//						break;
//					}
//				}
//			}
//
//		}
		
//		for(int x = 0; x < 4; x++){
//			if(colors[x] == correctColors[x]){
//				labelArray[x] = "O";
//			}
//		}
		shuffleArray(labelArray);
		return labelArray;
		
	}

	  static void shuffleArray(String[] ar)
	  {
	    Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      String a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	  
	  public void resetArray(String[] array){
		  for (int i = 0; i < array.length; i++){
			  array[i] = "X";
		  }
	  }
	  
	  public void finishGame(){
		 
			  
		  JOptionPane.showMessageDialog(null, playerName + " have won " + numWins + "/"  + numGames + " times");
		  System.exit(0);
		  
	  }
	  
	  public void showAnswer(JButton btn1, JButton btn2, JButton btn3, JButton btn4){
		  btn1.setBackground(correctColors[0]);
		  btn2.setBackground(correctColors[1]);
		  btn3.setBackground(correctColors[2]);
		  btn4.setBackground(correctColors[3]);
	  }
	  
	  public Boolean checkWin(){
		  int correct = 0;
		  for (int x = 0; x < 4; x++){
			  if(colors[x] == correctColors[x]){
				  correct += 1;
			  }
		  }
		  if (correct == 4){
			  JOptionPane.showMessageDialog(null, "YOU WIN");
			  return true;
			  
		  }
		  else{
			  return false;
		  }
		  
	  }
	  
	  public void resetGame(JButton[] array, JButton[] answerArray, JLabel[] labels){
		  
		  setCorrectColors();
		  for (int x = 0; x < array.length; x++){
			  array[x].setBackground(Color.RED);	
			  labels[x].setText("");
		  }
		  for (int x = 0; x < 4; x++){
			  array[x].setEnabled(true);
			  answerArray[x].setBackground(null);
			  labelArray[x] = "X";
			  
		  }
		  
	  }

}
