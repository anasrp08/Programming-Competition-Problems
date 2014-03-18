import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class tlg {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int player1sum = 0;
		int player2sum = 0;
		int currentLead = 0;
		int lead = 0;
		int winner = 0;
		String[] arr = new String[2];
		for (int i = 0; i < a; i++) {
			arr = br.readLine().split(" ");
			player1sum += Integer.parseInt(arr[0]);
			player2sum += Integer.parseInt(arr[1]);
			if(player1sum >= player2sum){
				currentLead = player1sum - player2sum;
				if(currentLead > lead){
					lead = currentLead;
					winner = 1;
				}
			}
			else{
				currentLead = player2sum - player1sum;
				if(currentLead > lead){
					lead = currentLead;
					winner = 2;
				}
			}
		}
		System.out.println(winner+" "+lead);
	}
 
}
 