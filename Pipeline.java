package devops;

class Jenkins{
	Jenkins(){
		System.out.println("welcome to jenkins");
	}
}
class ci extends Jenkins{
	ci(){
		System.out.println("Ci process start..");
	}
}

public class Pipeline extends ci {
void line(){

	System.out.println("executed pipeline");
	
}
	public static void main(String[] args) {
		Pipeline execute = new Pipeline();
		
       execute.line();
	}

}
