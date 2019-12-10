// class Example {
//     static void main(String[] args) {
//         println("Hello World");
//     }
// }

// import groovy.xml.MarkupBuilder
// // 身份标识
// def xml = new MarkupBuilder()

// class Example {
//     // static void main(String[] args) {
//     //     int x= 5;

//     //     long y = 100L;

//     //     float a = 10.56f;

//     //     double b = 10.5e40;

//     //     BigInteger bi = 30g;

//     //     BigDecimal bd =3.5g;

//     //     println(x);
//     //     println(y);
//     //     println(a);
//     //     println(b);
//     //     println(bi);
//     //     println(bd);

//     //     def range = 5..10;
//     //     println(range);
//     //     println(range.get(2))

//     // }

//     // static def DisplayName(){
//     //     println("This is how methods work in groovy");
//     //     println("This is an example of a simple method");
//     // }

//     // static void main(String[] args){
//     //     DisplayName();
//     // }
// }

// class Example {
//     static void sum(int a,int b){
//         int c = a+b;
//         println(c)
//     }
//     static void main(String[] args) {
//         sum(10,5);
//     }
// }

// class Example {
//     int x;

//     public int getX(){
//         return x;
//     }

//     public void setX(int pX){
//         x = pX;
//     }

//     static void main(String[] args) {
//         Example ex = new Example();

//         ex.setX(100)
//         println(ex.getX());
//     }
// }

// import java.io.File
// class Example {
//     static void main(String[] args) {
//         new File("E:/Example.txt").eachLine {
//             line -> println "line : $line";
//         }
//     }
// }

// import java.io.File

// class Example {
//     static void main(String[] args){
//         new File("E:/Example.txt").eachLine{
//             line -> println "lien : $line";
//         }
//     }
// }

// class Example {
//     static void main(String[] args){
//         File file = new File("E:/Example.txt")
//         println file.text
//     }
// }

// import java.io.File
// class Example {
//     static void main(String[] args) {
//         new File("E:/","Example.txt").withWriter('utf-8'){
//             writer -> writer.writeLine 'Hello World'
//         }
//     }
// }

class Example {
    static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("First String")
        list.add("Secound String")
        list.add("Third String")

        for (String str:list){
            println(str);
        }
    }
}