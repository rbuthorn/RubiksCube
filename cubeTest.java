import java.util.Scanner;

public class cubeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean solved = false;
		int move = 0;
		String[][] redSide = { { "|", "R", "|", "R", "|", "R", "|" }, { "|", "R", "|", "R", "|", "R", "|" },
				{ "|", "R", "|", "R", "|", "R", "|" } };
		String[][] whiteSide = { { "|", "W", "|", "W", "|", "W", "|" }, { "|", "W", "|", "W", "|", "W", "|" },
				{ "|", "W", "|", "W", "|", "W", "|" } };
		String[][] yellowSide = { { "|", "Y", "|", "Y", "|", "Y", "|" }, { "|", "Y", "|", "Y", "|", "Y", "|" },
				{ "|", "Y", "|", "Y", "|", "Y", "|" } };
		String[][] orangeSide = { { "|", "O", "|", "O", "|", "O", "|" }, { "|", "O", "|", "O", "|", "O", "|" },
				{ "|", "O", "|", "O", "|", "O", "|" } };
		String[][] greenSide = { { "|", "G", "|", "G", "|", "G", "|" }, { "|", "G", "|", "G", "|", "G", "|" },
				{ "|", "G", "|", "G", "|", "G", "|" } };
		String[][] blueSide = { { "|", "B", "|", "B", "|", "B", "|" }, { "|", "B", "|", "B", "|", "B", "|" },
				{ "|", "B", "|", "B", "|", "B", "|" } };
		System.out.println("For a clockwise left turn, type 1 into the console. For a clockwise right turn, type 2 into the console, etc.");
		System.out.println(" ");
		System.out.println("For a counterclockwise left turn, type 11 into the console. For a counterclockwise right turn, type 22 into the console, etc.");
		Cube cube = new Cube(whiteSide, yellowSide, redSide, greenSide, blueSide, orangeSide);
		for (int b = 0; b < 20; b++) {
			int rand = (int) (Math.random() * 12);
			if (rand == 0) {
				System.out.println("L");
				cube.Lmove();
			} else if (rand == 1) {
				System.out.println("R");

				cube.Rmove();
			} else if(rand == 2) {
				System.out.println("F");
				cube.Fmove();
			} else if(rand == 3) {
				System.out.println("B");
				cube.Bmove();
			}
			else if (rand == 4) {
				System.out.println("U");

				cube.Umove();
			} else if (rand == 5) {
				System.out.println("D");

				cube.Dmove();
		} else if (rand == 6) {
			System.out.println("L'");
			cube.Lmove();
			cube.Lmove();
			cube.Lmove();
		} else if (rand == 7) {
			System.out.println("R'");
			cube.Rmove();
			cube.Rmove();
			cube.Rmove();
		}  else if (rand == 8) {
			System.out.println("F'");
			cube.Fmove();
			cube.Fmove();
			cube.Fmove();
		} else if(rand == 9) {
			System.out.println("B'");
			cube.Bmove();
			cube.Bmove();
			cube.Bmove();
		}
		else if (rand == 10) {
			System.out.println("U'");
			cube.Umove();
			cube.Umove();
			cube.Umove();
		} else if (rand == 11) {
			System.out.println("D'");
			cube.Dmove();
			cube.Dmove();
			cube.Dmove();
		}

		if(b == 19){
		for (int i = 0; i < 3; i++) {
			System.out.println("\t");
			int count = 0;
				if (count == 0) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(redSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
				if (count == 1) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(whiteSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
				if (count == 2) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(blueSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
				if (count == 3) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(greenSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
				if (count == 4) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(orangeSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
				if (count == 5) {
					for (int j = 0; j < redSide[0].length; j++) {
						System.out.print(yellowSide[i][j]);

					}
					count += 1;
					System.out.print("\t");
				}
		}
		}
		}
		while(solved == false) {
			System.out.println(" ");
			System.out.println("The moves consist of: left, right, front, back, up, down, left', right', front', back', up', and down'");
			System.out.println(" ");
			System.out.println("left = 1, right = 2, front = 3, back = 4, up = 5, down = 6, left' = 11, right' = 22, front' = 33, etc.");
			System.out.println(" ");
			System.out.println("Please enter a move: ");
			move = scanner.nextInt();
			if (move == 1) {
				cube.Lmove();
			} else if (move == 2) {
				cube.Rmove();
			} else if (move == 3) {
				cube.Fmove();
			} else if (move == 4) {
				cube.Bmove();
			} else if (move == 5) {
				cube.Umove();
			} else if (move == 6) {
				cube.Dmove();
			
		} else if (move == 11) {
			cube.Lmove();
			cube.Lmove();
			cube.Lmove();
		} else if (move == 22) {
			cube.Rmove();
			cube.Rmove();
			cube.Rmove();
		} else if (move == 33) {
			cube.Fmove();
			cube.Fmove();
			cube.Fmove();
		} else if (move == 44) {
			cube.Bmove();
			cube.Bmove();
			cube.Bmove();
		} else if (move == 55) {
			cube.Umove();
			cube.Umove();
			cube.Umove();
		} else if (move == 66) {
			cube.Dmove();
			cube.Dmove();
			cube.Dmove();
		} 
			else {
				System.out.println("Please enter a valid move");
			}
			for (int i = 0; i < 3; i++) {
				System.out.println("\t");
				int count = 0;
					if (count == 0) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(redSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
					if (count == 1) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(whiteSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
					if (count == 2) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(blueSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
					if (count == 3) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(greenSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
					if (count == 4) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(orangeSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
					if (count == 5) {
						for (int j = 0; j < redSide[0].length; j++) {
							System.out.print(yellowSide[i][j]);

						}
						count += 1;
						System.out.print("\t");
					}
			}
			solved = cube.isSolved();
			}
		scanner.close();
		}
	}
