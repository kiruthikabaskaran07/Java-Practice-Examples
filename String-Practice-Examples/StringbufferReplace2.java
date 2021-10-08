//program to replace the word/letters in the string
class  StringbufferReplace2
{
	public static void main(String[] args) 
	{
		StringBuffer sb =new StringBuffer("hello i am learning python");
        System.out.println("original string:  " +sb);
        System.out.println("modified string:  "+sb.replace(20,26,"java"));

}
}
