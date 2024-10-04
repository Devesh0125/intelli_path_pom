package Test;

import java.util.Scanner;

public class SimranTest1 {
    public static void main(String[] args) {
        System.out.println("Enter the Sentence ;");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words=sentence.split(" ");
        String longestWord= "";

        for (int i=0;i<words.length;i++){
            if (words[i].length()>=longestWord.length()){
                longestWord=words[i];

            }
            System.out.println(words[i]);
        }

        System.out.println("The longest word is :"+ longestWord);

    }

}
