/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
    Scanner sc= new Scanner(System.in);
    System.out.println("Hasbulla is trying to become a gold medalist in volleyball!");
    System.out.println("what way would you like him to become a star middle blocker?");
    System.out.println("1. Hasbulla learns about a renowned coach who specializes in training middle blockers. He decides to reach out, hoping to secure a spot in the coach's exclusive training camp. To impress the coach, he must first complete a grueling physical fitness test.");
    System.out.println("2. Hasbulla joins a local volleyball league, eager to get real game experience. He focuses on honing his blocking skills with the help of his teammates, but soon realizes he needs to develop his timing and agility. He seeks out tips from seasoned players on the team.");
    System.out.println("3. Recognizing his strengths, Hasbulla designs a unique training regimen specifically for middle blockers. He incorporates exercises that enhance his vertical leap and reaction time. He starts sharing his progress on social media, attracting the attention of fans and potential mentors.");
    
    int answer = sc.nextInt();
    if(answer == 1){
	System.out.println("Hasbulla learns about a renowned coach who specializes in training middle blockers. He reaches out and secures a spot in the coach's exclusive training camp. To impress the coach, he must first complete a grueling physical fitness test.");
    }
    else if(answer ==2){
    System.out.println("Hasbulla joins a local volleyball league to gain real game experience. He focuses on honing his blocking skills, but soon realizes he needs to develop his timing and agility.");
    }    
    else if(answer == 3){
    System.out.println("Recognizing his strengths, Hasbulla designs a unique training regimen specifically for middle blockers, incorporating exercises to enhance his vertical leap and reaction time. He shares his progress on social media.");
    }
    else{
    
    }
    
    
    
    }
}