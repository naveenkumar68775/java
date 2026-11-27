// class new1{
//     public static void main(String args[]){
//         System.out.println("Hello World");
//     }
// }
// class new2{
//     public static void main(String args[]){
//         System.out.println("Hello World");
//     }
// }

class space{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }

}
class new1{
    public static void main(String args[]){
        System.out.println("Hello World");
        space s = new space();
        System.out.println(s.add(10, 20));
    }
}