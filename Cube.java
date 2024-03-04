
public class Cube {
	private String[][] white;
	private String[][] green;
	private String[][] orange;
	private String[][] blue;
	private String[][] red;
	private String[][] yellow;
	
	public void setred(String[][] red) {
		this.red = red;
	}
	public String[][] getred(){
		return red;
	}
	public void setyellow(String[][] yellow) {
		this.yellow = yellow;
	}
	public String[][] getyellow(){
		return yellow;
	}
	public void setwhite(String[][] white) {
		this.white = white;
	}
	public String[][] getwhite(){
		return white;
	}
	public void setblue(String[][] blue) {
		this.blue = blue;
	}
	public String[][] getblue(){
		return blue;
	}
	public void setorange(String[][] orange) {
		this.orange = orange;
	}
	public String[][] getorange(){
		return orange;
	}
	public void setgreen(String[][] green) {
		this.green = green;
	}
	public String[][] getgreen(){
		return green;
	}
	
	public Cube() {
	}
	public Cube(String[][] newwhite, String[][] newyellow, String[][] newred, String[][] newgreen, String[][] newblue, String[][] neworange) {
		white = newwhite;
		yellow = newyellow;
		red = newred;
		green = newgreen;
		blue = newblue;
		orange = neworange;
}
	public void Lmove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[3][1];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = blue[a][1];
		}
		for(int a = 0; a < 3; a++) {
			blue[a][1] = blue[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			blue[2][a+count] = blue[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			blue[2-a][5] = blue[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			blue[0][6-a-count] = temprow[a][0];
			count+=1;
		}	
		for(int a = 0; a < 3; a++) {
			tempcol[a][0] = orange[a][5];
		}
		for(int a = 0; a < 3; a++) {
			orange[a][5] = white[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			white[2-a][1] = red[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			red[2-a][1] = yellow[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			yellow[2-a][1] = tempcol[a][0];
		}
	}
	public void Rmove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[3][1];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = green[a][1];
		}
		for(int a = 0; a < 3; a++) {
			green[a][1] = green[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			green[2][a+count] = green[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			green[2-a][5] = green[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			green[0][6-a-count] = temprow[a][0];
			count+=1;
		}
		for(int a = 0; a < 3; a++) {
			tempcol[a][0] = red[a][5];
		}
		for(int a = 0; a < 3; a++) {
			red[a][5] = white[a][5];
		}
		for(int a = 0; a < 3; a++) {
			white[a][5] = orange[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			orange[2-a][1] = yellow[a][5];
		}
		for(int a = 0; a < 3; a++) {
			yellow[a][5] = tempcol[a][0];
		}
		
	}
	public void Fmove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[3][1];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = red[a][1];
		}
		for(int a = 0; a < 3; a++) {
			red[a][1] = red[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			red[2][a+count] = red[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			red[2-a][5] = red[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			red[0][6-a-count] = temprow[a][0];
			count+=1;
		}	
		for(int a = 0; a < 3; a++) {
			tempcol[a][0] = blue[a][5];
		}
		for(int a = 0; a < 3; a++) {
			blue[a][5] = white[0][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			white[0][1+(2*a)] = green[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			green[2-a][1] = yellow[2][5-(2*a)];	
		}
		for(int a = 0; a < 3; a++) {
			yellow[2][5-(2*a)] = tempcol[a][0];
		}
		
	}
	public void Bmove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[3][1];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = orange[a][1];
		}
		for(int a = 0; a < 3; a++) {
			orange[a][1] = orange[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			orange[2][a+count] = orange[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			orange[2-a][5] = orange[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			orange[0][6-a-count] = temprow[a][0];
			count+=1;
		}
		for(int a = 0; a < 3; a++) {
			tempcol[a][0] = green[a][5];
		}
		for(int a = 0; a < 3; a++) {
			green[a][5] = white[2][5-(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			white[2][5-(2*a)] = blue[2-a][1];
		}
		for(int a = 0; a < 3; a++) {
			blue[2-a][1] = yellow[0][1+(2*a)];	
		}
		for(int a = 0; a < 3; a++) {
			yellow[0][1+(2*a)] = tempcol[a][0];
		}
	}
	public void Umove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[1][3];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = yellow[a][1];
		}
		for(int a = 0; a < 3; a++) {
			yellow[a][1] = yellow[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			yellow[2][a+count] = yellow[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			yellow[2-a][5] = yellow[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			yellow[0][6-a-count] = temprow[a][0];
			count+=1;
		}
		for(int a = 0; a < 3; a++) {
			tempcol[0][a] = blue[0][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			blue[0][1+(2*a)] = red[0][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			red[0][1+(2*a)] = green[0][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			green[0][1+(2*a)] = orange[0][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			orange[0][1+(2*a)] = tempcol[0][a];
		}
	}
	public void Dmove() {
		String[][] temprow = new String[3][1];
		String[][] tempcol = new String[1][3];
		int count = 1;
		for(int a = 0; a < 3; a++) {
			temprow[a][0] = white[a][1];
		}
		for(int a = 0; a < 3; a++) {
			white[a][1] = white[2][a+count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			white[2][a+count] = white[2-a][5];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			white[2-a][5] = white[0][6-a-count];
			count+=1;
		}
		count = 1;
		for(int a = 0; a < 3; a++) {
			white[0][6-a-count] = temprow[a][0];
			count+=1;
		}
		for(int a = 0; a < 3; a++) {
			tempcol[0][a] = blue[2][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			blue[2][1+(2*a)] = orange[2][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			orange[2][1+(2*a)] = green[2][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			green[2][1+(2*a)] = red[2][1+(2*a)];
		}
		for(int a = 0; a < 3; a++) {
			red[2][1+(2*a)] = tempcol[0][a];
		}
	}
	public boolean isSolved() {
		boolean solve = false;
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(red[a][b] != red[a][b+2]) {
						return solve;
					}
				}
			}
		}
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(white[a][b] != white[a][b+2]) {
						return solve;
					}
				}
			}
		}
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(yellow[a][b] != yellow[a][b+2]) {
						return solve;
					}
				}
			}
		}
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(blue[a][b] != blue[a][b+2]) {
						return solve;
					}
				}
			}
		}
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(orange[a][b] != orange[a][b+2]) {
						return solve;
					}
				}
			}
		}
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				if(b % 2 != 0) {
					if(green[a][b] != green[a][b+2]) {
						return solve;
					}
					else if(green[a][b] == green[a][b+2] && a == 2 && b == 3) {
						solve = true;
						return solve;	
					}
				}
			}
		}
		return solve;
	}
}
