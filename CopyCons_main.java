class CopyCons
{
 int a,b,c;
 CopyCons()
 {
  a=0;
  b=0;
  c=0;
 }
 CopyCons(int x,int y,int z)
 {
  a=x;
  b=y;
  c=z;
 }
 CopyCons(CopyCons k)
 {
  a=k.a;
  b=k.b;
  c=k.c;
 }
 void display()
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("c="+c);
 }
}
class CopyConsMain
{
 public static void main(String args[])
 {
  CopyCons p=new CopyCons();
  CopyCons m=new CopyCons(5,7,2);
  CopyCons n=new CopyCons(m);
  p.display();
  m.display();
  n.display();
 }
}