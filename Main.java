class Person
{
private String name;
private int age;
public Person(String name,int age)
{
this.name=name;
this.age=age;
}
public void displayDetails()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}
public class Main
{
public static void main(String ar[])
{
Person person=new Person("Ram ji",30);
person.displayDetails();
}
}