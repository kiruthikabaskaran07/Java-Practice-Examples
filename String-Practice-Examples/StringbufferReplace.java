//program to replace the word/letters in the string
class StringbufferReplace
{
	public static void main(String[] args) 
	{
		StringBuffer sb =new StringBuffer("hello world");
        System.out.println("original string:  " +sb);
        System.out.println("modified string:  "+sb.replace(6,11,"java"));		
	}
}

