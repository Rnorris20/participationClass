class Main {
  public static void main(String[] args) {
    //objects have attributes (properties) & methods (behaviors)
    //classes are blueprints for objects

    //create object from class 

    Person p1 = new Person("Laura", "laura.gaber@patelhs.org", "112-334-5566");

    Person p2 = new Person("Sammy", "sammy@patelhs.org", "334-445-6677");

    //accessing the print method from teh person class
    p1.print();
    p2.print();

  }
}