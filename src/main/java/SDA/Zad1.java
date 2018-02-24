package SDA;

import java.io.*;

public class Zad1 {
    //Do katalogu resources dodaj plik simpleExample.txt i wyświetl jego zawartość w konsoli.

    public void Zad1() throws IOException {
        File file = new File("C:\\Users\\Astro\\IdeaProjects\\FileReaderExamples\\src\\resources\\simpleExample.txt");
        FileReader fis = new FileReader(file);
        String linia = "";
//Otwiera bufor do czytania znaków z pliku
        BufferedReader bfr = new BufferedReader(fis);
//dopóki metoda readLine() nie zwraca null (koniec pliku) wczytuj kolejne linie
        while((linia = bfr.readLine()) != null){
            System.out.println(linia);
        }

    }
}
