package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineProvider implements ArticleProvider{
    @Override
    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        String response = "y";

        while (response.equalsIgnoreCase("y")) {
            System.out.println("Enter title: ");
            String title = keyboard.nextLine();

            System.out.println("Enter author: ");
            String author = keyboard.nextLine();

            System.out.println("Enter year: ");
            int year = Integer.parseInt(keyboard.nextLine());

            Article art = new Article();
            art.setTitle(title);
            art.setAuthor(author);
            art.setYear(year);

            list.add(art);

            System.out.println("More articles? ");
            response = keyboard.nextLine();
        }

        return list;
    }
}
