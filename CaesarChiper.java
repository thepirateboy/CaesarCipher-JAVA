
package caesar.chiper;

import java.util.Arrays;
import java.util.Scanner;


public class CaesarChiper 
{
    


    public static void main(String[] args) 
    {
        String [] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        char [] plain = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //when i was starting, I tried to use arrays like these, convert sentence to array, 
        //locate and match the position from the sentenceArray, all for three days, and it gave me massive headache >.<"
        //so I gave up on using array for this chiper because i'm running out of time :((
        
        
        //my code of caesar chiper below is 100% workable :))
        
        System.out.println("***********************************");
        System.out.println("********* CAESAR CHIPER  **********");
        System.out.println("***********************************");
        
        
        
        String sentence = "";
        int shift = 0;
        Scanner scanner = new Scanner(System.in);
        start();
        int option = 1;
        while (option != 2)
        {
            
            
            System.out.println("************************************");
            
            
            System.out.println("Would you like to continue? ");
            System.out.println("1. yes \n2. no");
            
            
            System.out.print("Enter your option 1|2 ==> ");
            option = scanner.nextInt();
            
            switch (option)
            {
                case 1:
                    start();
                    break;
                case 2:
                    break;
                    
            }
            System.out.println("************************************");
        }

    }
    
    //ENCRYPTION
    static String cipherEncrypt(String sentence, int shift)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text that you wish to encrypt ==> ");
        sentence = scanner.nextLine();
           
        System.out.print("Input your shift key (1-26) ==> ");
        shift = scanner.nextInt();
        
        String newSentence = "";
        for(int i = 0; i < sentence.length(); i++)
        {
            //use increasement to the new sentence char
            newSentence += (char)(sentence.charAt(i) + shift);
        }
        newSentence = newSentence.toUpperCase();
        System.out.println("Message to encrypt : " + sentence);
        System.out.println("Encrypted message  : " + newSentence);
        return newSentence;
        
        
    
    }
    
    //DECRYPTION
    static String cipherDecrypt(String sentence, int shift)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text that you wish to Decrypt ==> ");
        sentence = scanner.nextLine();
        
           
        System.out.print("Input your shift key (1-26) ==> ");
        shift = scanner.nextInt();
        shift *= -1;
        
        String newSentence = "";
        for(int i = 0; i < sentence.length(); i++)
        {
            //use Decreacement to the new sentence char
            newSentence += (char)(sentence.charAt(i) + shift);
        }
        newSentence = newSentence.toUpperCase();
        System.out.println("Message to decrypt : " + sentence);
        System.out.println("Decrypted message  : " + newSentence);
        return newSentence;
    }
   

        
        
   static void start()
   {
       Scanner scanner = new Scanner(System.in);
       String sentence = "";
       int shift = 0;
       String newSentence = "";
       System.out.println("would you like to do? \n1. encrption \n2. decrption");
       int response = 0;
 
       System.out.print("Your response: (1|2) ==> ");
       response = scanner.nextInt();
       
       switch (response)
       {
           case 1:
               System.out.println("So you have chosen Encrpytion");
           
               cipherEncrypt(sentence, shift);
               break;
                
           case 2:
               System.out.println("So you have chosen Decrpytion");
           
               cipherDecrypt(sentence, shift);
               break;

               
               
       }
       
       
       
   }
    
}

//I'm sorry for this much of bugs, please help me on monday to fix this :(
