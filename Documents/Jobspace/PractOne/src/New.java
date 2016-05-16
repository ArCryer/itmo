
public class New {

	public static void main(String[] args) {
		int i = 5, j = 10;
		String str = "My first string";
		System.out.println(str);
		System.out.println("Some text:"+str);
		int k = i+j;
		System.out.println("Sum:"+k);
		System.out.println("Sum:"+(i+j));
		while(i<j){ 
			System.out.println(str);             
			i++;             
		}
		if(i==j){ 
			System.out.println("i="+i+", j="+j+" equal"); 
		} else {             
			System.out.println("i="+i+", j="+j+" not equal"); 
		}
		System.out.println(args[0]);
	}

}
