import java.util.Scanner;
import java.util.Random;
class solution{

	public static boolean checkVictory(char[][] ttt, char c, char r){
		for(int i = 0; i < 3; i++){
			if((ttt[i][0] == c && ttt[i][1] == c && ttt[i][2] == c) || (ttt[0][i] == c && ttt[1][i] == c && ttt[2][i] == c)) {
				System.out.println("YOU WON THE GAME");
				return false;}
			else if((ttt[i][0] == r && ttt[i][1] == r && ttt[i][2] == r) || (ttt[0][i] == r && ttt[1][i] == r && ttt[2][i] == r)) {
				System.out.println("COMP WON THE GAME");
				return false;}
		}
		if((ttt[0][0] == c && ttt[1][1] == c && ttt[2][2] == c) || (ttt[0][2] == c && ttt[1][1] == c && ttt[2][0] == c)) {
			System.out.println("YOU WON THE GAME");
			return false;}
		if((ttt[0][0] == r && ttt[1][1] == r && ttt[2][2] == r) || (ttt[0][2] == r && ttt[1][1] == r && ttt[2][0] == r)) {
			System.out.println("COMP WON THE GAME");
			return false;}

			int pl = 0;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(ttt[i][j] == '.') pl++;
				}
			}
			if(pl==0){
				System.out.println("GAME DRAWN");
				return false;
			}
		return true;
	} 

	public static void printTicTacToe(char[][] ttt){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(ttt[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static char[][] cTurn(char[][] ttt, char c, char r, int c1, int c2){

		for(int i = 0; i < 3; i++){
			if     (ttt[i][0] == r && ttt[i][1] == r && ttt[i][2] == '.') {ttt[i][2] = c;return ttt;}
			else if(ttt[i][0] == r && ttt[i][2] == r && ttt[i][1] == '.') {ttt[i][1] = c;return ttt;}
			else if(ttt[i][1] == r && ttt[i][2] == r && ttt[i][0] == '.') {ttt[i][0] = c;return ttt;}

			else if(ttt[0][i] == r && ttt[1][i] == r && ttt[2][i] == '.') {ttt[2][i] = c;return ttt;}
			else if(ttt[0][i] == r && ttt[2][i] == r && ttt[1][i] == '.') {ttt[1][i] = c;return ttt;}
			else if(ttt[1][i] == r && ttt[2][i] == r && ttt[0][i] == '.') {ttt[0][i] = c;return ttt;}
		}

		if(ttt[0][0] == r && ttt[1][1] == r && ttt[2][2] == '.') {ttt[2][2] = c;return ttt;}
		if(ttt[0][0] == r && ttt[2][2] == r && ttt[1][1] == '.') {ttt[1][1] = c;return ttt;}
		if(ttt[1][1] == r && ttt[2][2] == r && ttt[0][0] == '.') {ttt[0][0] = c;return ttt;}

		if(ttt[1][1] == r && ttt[2][0] == r && ttt[0][2] == '.') {ttt[0][2] = c;return ttt;}
		if(ttt[2][0] == r && ttt[0][2] == r && ttt[1][1] == '.') {ttt[1][1] = c;return ttt;}
		if(ttt[1][1] == r && ttt[0][2] == r && ttt[2][0] == '.') {ttt[2][0] = c;return ttt;}

		
		if(ttt[1][1] == '.') {ttt[1][1]=r; return ttt;}
		
		for(int i = 0; i < 3; i++){
			if     (ttt[i][0] == c && ttt[i][1] == c && ttt[i][2] == '.') {ttt[i][2] = r;return ttt;}
			else if(ttt[i][0] == c && ttt[i][2] == c && ttt[i][1] == '.') {ttt[i][1] = r;return ttt;}
			else if(ttt[i][1] == c && ttt[i][2] == c && ttt[i][0] == '.') {ttt[i][0] = r;return ttt;}

			else if(ttt[0][i] == c && ttt[1][i] == c && ttt[2][i] == '.') {ttt[2][i] = r;return ttt;}
			else if(ttt[0][i] == c && ttt[2][i] == c && ttt[1][i] == '.') {ttt[1][i] = r;return ttt;}
			else if(ttt[1][i] == c && ttt[2][i] == c && ttt[0][i] == '.') {ttt[0][i] = r;return ttt;}
		}

		if(ttt[0][0] == c && ttt[1][1] == c && ttt[2][2] == '.') {ttt[2][2] = r;return ttt;}
		if(ttt[0][0] == c && ttt[2][2] == c && ttt[1][1] == '.') {ttt[1][1] = r;return ttt;}
		if(ttt[1][1] == c && ttt[2][2] == c && ttt[0][0] == '.') {ttt[0][0] = r;return ttt;}

		if(ttt[1][1] == c && ttt[2][0] == c && ttt[0][2] == '.') {ttt[0][2] = r;return ttt;}
		if(ttt[2][0] == c && ttt[0][2] == c && ttt[1][1] == '.') {ttt[1][1] = r;return ttt;}
		if(ttt[1][1] == c && ttt[0][2] == c && ttt[2][0] == '.') {ttt[2][0] = r;return ttt;}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(ttt[i][j] == '.'){
					ttt[i][j] = r;
					return ttt;
				}
			}
		}
	
		return ttt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("TIC TAC TOE");

		char[][] ttt = {{'.','.','.'},{'.','.','.'},{'.','.','.'}};

		System.out.print("Enter your mark ( O | X ) : ");
		char c = scan.next().charAt(0);
		char r;
		if(c == 'O') r = 'X';
		else r = 'O';

		boolean v;
		do{
			int i,j;
			do{
				System.out.print("Enter your choice : ");
				i = scan.nextInt();
				j = scan.nextInt();
			}while(ttt[i][j] != '.');
			ttt[i][j] = c;

			printTicTacToe(ttt);
			v = checkVictory(ttt,c,r);
			ttt = cTurn(ttt,c,r,i,j);
			printTicTacToe(ttt);
			v = checkVictory(ttt,c,r);
		}while(v);
	}
}