import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Game {

	private Random r = new Random();
	private int correctColor1;
	private int correctColor2;
	private int correctColor3;
	private int correctColor4;
	private Color colors[] = new Color[4];
	private Color correctColors[] = new Color[4];
	private String labelArray[] = new String[4];
	Color brown = new Color(139,69,19);
	
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
			correctColors[index] = brown;
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
		
		for(int x = 0; x < 4; x++){
			for(int y = 0; y < 4; y++){
				if(colors[x] == correctColors[y]){
					if(x == y){
						labelArray[x] = "O";
					}
					else{
						labelArray[x] = "!";
					}
				}
				else{
					labelArray[x] = "X";
				}
				
			}
		}
		return labelArray;
		
	}
	
}
