// class object and constructor 

// class pen {
//     String type;
//     String color;

//     public void write() {
//         System.out.println("Writing something");
//     }

//     public void color() {
//         System.out.println(this.color);
//     }
// }

// different constructors 

// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println(this.age);
//         System.out.println(this.name);
//     }

//     // non parameterzied Constructor
//     Student() {
//         System.out.println("Constructor called ");
//     }

//     // parameterzied constructor
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // copy constructor
//     Student(Student s4) {
//         this.name = s4.name;
//         this.age = s4.age;
//     }
// }

// constructor are of three types

// 1]nonparameterzied constructor
// 2]parameterzied constructor
// 3]copy constructor

// constructor are used for construct the object

// three properties of constructor

// 1]constructor has same name as its class or object
// 2]constructor not return any value they not have any return type
// constructor are same as methods or function
// 3]it can only call once when the object is created

// if we not write non parameterzied constructor java write itself by default

// polymorphism

// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println("The Student Name is " + name + " and age is " + age);
//     }
// }

// Inheritance
class Shape {
    String color;

    public void area() {
        System.out.println("displays area");
    }
}

// 1]single level inheritance

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 2]Multi level inheritance

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 3]Hierarchial inheritance

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// 4] Hybrid inheritance

// combination of Single level, multilevel and hierarchial inheritance

// OOPS

public class lec17 {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "Blue";
        // pen1.type = "gel";

        // pen1.write();
        // System.out.println(pen1.color);

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.color();
        // pen2.color();

        // Student s1 = new Student();
        // s1.name = "Naruto";
        // s1.age = 22;
        // s1.printInfo();

        // Student s2 = new Student("Hinata", 21);
        // s2.printInfo();

        // Student s4 = new Student(s2);
        // s4.printInfo();

        // OOPS different concepts
        // four major concepts

        // 1] Abstraction
        // 2] Encapsulation
        // 3] Inheritence
        // 4] Polymorphism

        // 1] Polymorphism == poly(many) + morphism(forms)

        // same name function wrote in a same class for more than ones

        // two types
        // 1]function Overloading
        // compiletime polymorphism
        // create different function and it perform different operation but names are
        // same

        // 2]Function Overrideing
        // runtime polymorphism (used in inhertence)

        // 1] function Overloading (Polymorphism)

        // rules os fn overloading
        // differentiating factor must be there

        // 1] the return type differnt for differnt fn
        // 2] the argument type must be different for different fn
        // 3] the number of arguments passing is different for different fn

        // Student s1 = new Student();
        // s1.name = "Naruto";
        // s1.age = 22;

        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name, s1.age);

        // Inheritance
        // one class property transfer to the another class
        // increase reusibility (there is no need to write same property for diff fn)
        // base class / parent class = the property taken from this class
        // sub class / child class = the property assigned to this class

        // there are 4 types of inheritance in java and 5 in c++

        // 1] single level inheritance base class ----> derived class

        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}
