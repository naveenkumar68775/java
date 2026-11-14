

// class buffer{
//     public static void main(String args[]){
//         int a=10;
//         int b=20;
//         int c=a+b;
//         System.out.println("The sum of a and b is: "+c);
//     }
    
// }

// class buffer{
//     public static void main (String []args){
//         String n="Thunder";
//         System.out.println(n);
//     }
// }

// class buffer{
//     public static void main(String args[]){
//         StringBuffer sb=new StringBuffer("Hello");
//         sb.append(" World");
//         System.out.println(sb);
//     }
// }

// class buffer{
//     public static void main(String args[]){
//         StringBuffer sb=new StringBuffer("Hello");
//         sb.insert(1,"Java");
//         System.out.println(sb);
//     }
// }

class buffer{
    public static void main(String args[]){
        String n="Thunder";
        StringBuffer sb=new StringBuffer(n);
        sb.reverse();
        System.out.println(sb);
    }
}