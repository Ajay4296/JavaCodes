import java.util.*;

public class TicTacToe {
	static ArrayList<Integer> playerPossition=new ArrayList<Integer>();
	static ArrayList<Integer> cpuPossition=new ArrayList<Integer>();

	public static void main(String[] args) {
		
			char[][] gameboard= { {' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' ',},{'-','+','-','+','-'},{' ','|',' ','|',' ',} };
	printGameBoard(gameboard);
	while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number [1-9]");
		int playerpos=scan.nextInt();
		while(playerPossition.contains(playerpos)||cpuPossition.contains(playerpos)) {
		System.out.println("enter a correct possition");
		playerpos=scan.nextInt();
		}
		placePiece(gameboard,playerpos,"player"); 
		
		
		
		String result = checkWinner();
		if(result.length()>0)
		{ 
			System.out.println(result);
			break;
		
		}   
		
		Random rand=new Random();
		int cpupos=rand.nextInt(9)+1;
		while(playerPossition.contains(cpupos)||cpuPossition.contains(cpupos)) {
		cpupos=rand.nextInt(9)+1;
		}  
		placePiece(gameboard,cpupos,"cpu");
		
		printGameBoard(gameboard);
		 result=checkWinner();
		if(result.length()>0)
		{
		System.out.println(result);
		break;
		}
		

		
	}
	}	
	
public static void printGameBoard(char[][] gameBoard)
{
	for(char[] row:gameBoard)
	{
		for(char c:row)
		{
			System.out.print(c);
		
		}
		System.out.println();
	}
}
	public static void placePiece(char[][] gameboard,int pos,String user)
	{   
		char symbol=' ';
		if(user.equals("player"))
		{
			symbol='x';
		playerPossition.add(pos);
		}
		else if(user.equals("cpu"))
		{
			symbol='0';
		cpuPossition.add(pos);
		}
		switch(pos)
		{
		case 1:
			gameboard[0][0]=symbol;
			break;
		case 2:
			gameboard[0][2]=symbol;
			break;
		case 3:
			gameboard[0][4]=symbol;
			break;
		case 4:
			gameboard[2][0]=symbol;
			break;
		case 5:
			gameboard[2][2]=symbol;
			break;
		case 6:
			gameboard[2][4]=symbol;
			break;
		case 7:
			gameboard[4][0]=symbol;
			break;
		case 8:
			gameboard[4][2]=symbol;
			break;
		case 9:
			gameboard[4][4]=symbol;
			break;
			default:
				break;
			
		}
		

	}
	public static String checkWinner()
	{
		
		List toprow=Arrays.asList(1,2,3);
		List midrow=Arrays.asList(4,5,6);
		List botrow=Arrays.asList(7,8,9);
		List rightcol=Arrays.asList(1,4,7);
		List midcol=Arrays.asList(2,5,8);
		List leftcol=Arrays.asList(3,6,9);
		List cross1=Arrays.asList(1,5,9);
		List cross2=Arrays.asList(7,5,3);
		
		List<List> winning=new ArrayList<List>();
		winning.add(toprow);
		winning.add(midrow);
		winning.add(botrow);
		winning.add(rightcol);
		winning.add(midcol);
	 	winning.add(leftcol);
		winning.add(cross1);
		winning.add(cross2);
		  
		for(List l:winning) {
			if(playerPossition.containsAll(l))
			{
				return "congratulation you won";
			}
			else if(cpuPossition.containsAll(l))
			{
			
			return "sorry :-you lose";
			}
			else if(playerPossition.size()+cpuPossition.size()==9) {
			return "Draw";}
			
		}
		return "";
		
	
	}
}


