package Test;

//Hello
public class BMW extends Cars{
		void Start(String str){
		System.out.println(str+" Engine is starting");
		}

	public static void main(String args[]){
		BMW obj = new BMW();
		obj.Start("Yess");
	}
}
