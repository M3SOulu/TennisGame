import java.util.ArrayList;
import java.util.Scanner;

public class TennisGame {

	static ArrayList<String> scores= new ArrayList<>();

	static int player1;
	static int player2;

	static Scanner in = new Scanner(System.in);
	public static void setup(){
		player1=0;
		player2=0;
		scores.add(0,"love");
		scores.add(1,"fifteen");
		scores.add(2, "thirty");
		scores.add(3, "forty");
	}
	public static void main(String[] args) {
		setup();
		System.out.println("start the match");
		System.out.println(getScore());

		do{
			makeGoal();
			System.out.println(getScore());


		}while(player1<4||player2<4);
	}


	public static String getScore(){

		return ("score: "+scores.get(player1)+"-"+scores.get(player2));
	}

	public static void makeGoal(){
		int i=0;
		do{
			System.out.println("Who make the goal?");
			i= in.nextInt();
			if (i==1) {
				player1++;
			}else if(i==2){
				player2++;
			}

		}while(i!=1 ||i!=2);
	}
}
