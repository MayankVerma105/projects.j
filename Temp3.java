class Temp3
{
void show(byte b)
{
System.out.println(b);
}
void show(short s)
{
System.out.println(s);
}
void show(int i)
{
System.out.println(i);
}
void show(long l)
{
System.out.println(l);
}
public static void main(String[] args)
{
Temp3  t1= new Temp3();
t1.show(10);
t1.show(10l);
}
}