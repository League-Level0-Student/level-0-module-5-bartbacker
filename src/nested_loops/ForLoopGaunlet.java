package nested_loops;

public class ForLoopGaunlet {
	public static void main(String[] args) {
		/*for(int i = 2005; i < 2020; i++) {
			System.out.println("In "+ i +" I was "+ (i-2005) +" years old");
	}*/
		for(int i = 0; i < 9; i++) {
			if(i/3%3==0) {
				for(int j = 0; j < 2; j++) {
				System.out.print(i);
				}
				System.out.println();
				
				}
			}
		}
	}

