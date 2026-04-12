class Instancevariable {
    // first create any instnce variable 
    String name;
    int age;
    // method to dispaly data
     void show(){
    System.out.println(name);
     System.out.println(age);

}
 public static void main(String[] args){
    // creating first object
    Instancevariable s1 = new Instancevariable();
    s1.name = "alice";
    s1.age = 12;

 // you can also create another object
    Instancevariable s2 = new Instancevariable();
    s2.name = "bob";
    s2.age = 33;
    
    // calling method
    s1.show();
    s2.show();
 }

}
