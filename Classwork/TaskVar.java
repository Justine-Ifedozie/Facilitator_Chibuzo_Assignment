public class TaskVar {
        public static void main (String[] args) {

int var1 = 20;
int var2 = 30;
int var3 = 40;

int temp = 0;

temp = var1;
var1 = var2;
var2 = var3;
var3 = temp;

System.out.println("var1:" + var1);
System.out.println("var2:"+ var2);
System.out.println("var3:" + var3);





        }
}