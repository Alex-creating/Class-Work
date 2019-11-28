package teamHobbies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class teamHobbies {

	public static void main(String[] args) {
		String [] lukesHobbies = {"Reading", "Ice skating", "Gaming", "Sleeping", "Cycling", "Coding"}	;
		String [] jessHobbies = {"Canoe polo", "Kayaking", "Hiking", "Banana bread"};
		String [] chloeHobbies = {"violin", "reading", "eating", "sleeping"};
		String [] adamHobbies = { "Reading", "Sleeping", "Gaming", "Rock Climbing" };
		String [] alexHobbies = {"Drawing", "Reading", "Swimming", "Running", "Gaming", "Coding"};
		String [] alwinHobbies = { "Sports","Gym","Gaming","Reading"};
		
	String [][] teamHobbies = {lukesHobbies, jessHobbies, chloeHobbies, adamHobbies, alexHobbies, alwinHobbies};
	
	/*for (String [] a : teamHobbies) {
		for (String b : a) {
			System.out.print(b + ", ");
		}
		System.out.println();
	}
	
	for (int i = 0; i < teamHobbies.length; i++) {
		for (int j = 0; j<teamHobbies[i].length; j++) {
			System.out.print(teamHobbies[i][j]);
		}System.out.println(" ");*/
	
List <String> lukeList = Arrays.asList(lukesHobbies);
List <String> lukeList2 = new ArrayList<>();
lukeList2.add("Wrestling");
System.out.println(lukeList);
System.out.println(lukeList2);
	
	}
	
	
	
	
	
	} 
	

/*}*/
