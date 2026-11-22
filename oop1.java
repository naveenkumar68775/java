// class oop1{
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
// }

// class thunder{
//     String name;


// }
// class oop1{
//     public static void main(String []args){
//         thunder t1 = new thunder();
//         t1.name = "Thunder";
//         System.out.println(t1.name);
//     }
// }\

class thunder{
    String name;
    int age;
    String breed;

    public void bark(){
        System.out.println("Woof Woof");
    }
}
class oop1{
    public static void main(String []args){
        thunder t1 = new thunder();
        t1.name = "Thunder";
        t1.age = 3;
        t1.breed = "Labrador";      
    }
}