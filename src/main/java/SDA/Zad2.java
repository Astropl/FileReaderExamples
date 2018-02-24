package SDA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zad2
//Do katalogu resources dodaj plik users.txt Plik zawiera listę imion oraz nazwisk wraz z
//wiekiem. Utwórz obiekt User i utwórz listę obiektów z danymi z pliku.

    /*Rozbuduj poprzedni algorytm. Utwórz 2 listy. Na jednej zapisz kobiety, natomiast na drugiej
        mężczyzn (dla ułatwienia przyjmujemy że każda osoba z imieniem kończącym się na „a”
        jest kobietą). Na listach zapisuj tylko osoby pełnoletnie.*/ {
    public void Zad2() throws IOException {
        String words[];
        String firstName, lastName;
        int age;
        List <String> users = new ArrayList <String>();
        List <String> usersWomen = new ArrayList <String>();
        List <String> usersMen = new ArrayList <String>();

        File file = new File("C:\\Users\\Astro\\IdeaProjects\\FileReaderExamples\\src\\resources\\users.txt");
        FileReader fis = new FileReader(file);
        String linia = "";
        BufferedReader bfr = new BufferedReader(fis);
        while ((linia = bfr.readLine()) != null) {
            //ystem.out.println(linia);
            words = (linia.split(" "));
            firstName = words[0];
            lastName = words[1];
            age = Integer.parseInt(words[2]);

            users.add(firstName + " " + lastName + " " + age);
//todo: Dodoaje iste kobiet
            StringBuilder sb = new StringBuilder();

            char lastLetter = firstName.charAt(firstName.length() - 1);
            //char last = phone.charAt(phone.length() - 1); // last char is at index length - 1
            //
            //Read more: http://javarevisited.blogspot.com/2016/02/how-to-get-first-and-last-character-of-String-in-java-example.html#ixzz584CEHNRU
            if (lastLetter == 'a') {
                usersWomen.add(firstName + " " + lastName + " " + age);
            } else {
                usersMen.add(firstName + " " + lastName + " " + age);
            }

//String tempKobieta = firstName.

//todo: Dodoaje liste mezczyzn
        }
        System.out.println("Cała lista");
        for (int i = 0; i < users.size(); i++)
        {
            System.out.println(users.get(i));

    }
        System.out.println("Kobiety");
        for (int i = 0; i < usersWomen.size(); i++)
        {

            System.out.println(usersWomen.get(i));

        }
        System.out.println("Mezczyzni");
        for (int i = 0; i < usersMen.size(); i++)
        {

            System.out.println(usersMen.get(i));
        }
    }


}
// File file = new File("pass.txt");
//        Scanner in = new Scanner(file);
//        String zdanie = in.nextLine();
//        wynik1 = zdanie.split(","); // uzywam metody split ktory pozwaa mi rodzieic stringa wcztanego w calosci jako linia i z rodzielnikiem przecinek ","
//        System.out.println(zdanie);