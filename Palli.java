public class Palli{
public static void main(String[] args){


int number = 23432;
 int pal = number;

int rev = 0;
int i = 0;

 for(int counter = 1; counter <= pal; counter++){
 i = pal % 10;
rev = rev * 10 + i;
 pal = pal / 10;
}
if(number == rev){
System.out.print(true);
}
if(number != rev){
System.out.print(false);
}

}
}