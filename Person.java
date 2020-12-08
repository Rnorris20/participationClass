public class Person{}
{
  //attributes -- AKA variables
  private String name;
  private String email;
  private String phoneNumber;

  //methods -- something that our object can do
  public void print()
  {
    System.out.println("Name = " + name);
    System.out.println("Email = " + email);
    System.out.println("Phone Number = " + phoneNumber);
  }

  //Constructor -- assign value to our variables
  public Person(String anotherName, String anotherEmail, String anotherNumber)
  {
    name = anotherName;
    email = anotherEmail;
    phoneNumber = anotherNumber;
  }

}