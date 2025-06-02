public class LearningStrings {
        public static void main (String [] args){

String message = "Welcome Home";
System.out.println(message.length());

System.out.println(message.charAt(3));

System.out.println(message.toLowerCase());

System.out.println(message.toUpperCase());

String [] messages = {"Welcome my friend"};

for (int i = 0; i < messages.length; i++)
        System.out.println(messages[i]);
        
      System.out.println(message.indexOf('e'));  
        
   "Welcome to Java".lastIndexOf('W');   
        
char [] chars = message.toCharArray();      

String sample = "3456";
//double result = Double.parseDouble(sample);  
int result = Integer.parseInt(sample); 
       System.out.println(result);




        }
}