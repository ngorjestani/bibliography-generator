package edu.wctc;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileReaderProvider implements ArticleProvider{
    @Override
    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();
        File file = new File("articles.txt");

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] contents = line.split(",");

                Article article = new Article();
                article.setTitle(contents[0]);
                article.setAuthor(contents[1]);
                article.setYear(Integer.parseInt(contents[2]));

                list.add(article);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
