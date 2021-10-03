class bufferexample
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Promgarmming");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("\n\n----------\n\n");
		sb1.append(sb2);
		System.out.println(sb1);
}
}