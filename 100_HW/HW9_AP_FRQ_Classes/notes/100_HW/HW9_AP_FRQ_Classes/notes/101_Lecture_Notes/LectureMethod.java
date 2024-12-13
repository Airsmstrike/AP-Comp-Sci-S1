/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
    printAnimal();
    
    greeting("Matthew");
    
    double newSalary = raise(1000, 3);  //1030
    System.out.println(newSalary);      //1030
    
    newSalary = raise(newSalary, 10);   
    System.out.println(newSalary);
	}
	private static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("hi "+ name);
	}
	public static void printAnimal(){
	    System.out.println("      .         ");   
        System.out.println("\\_____)\\_____");
        System.out.println("/--v____ __`<");         
        System.out.println("        )/    ");         
        

	}
	
}