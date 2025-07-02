package p1;

public class ContinueKeyword_problem {

	public static void main(String[] args) {
		
		
		for(int i = 1 ; i<=20;i++)
			
		{
			if(i%3 ==0 || i%5==0)
			{
				
				continue ;
			}
			
			System.out.print(i+" ");
		}

	}

}
