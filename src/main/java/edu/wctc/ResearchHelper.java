package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResearchHelper {
    @Autowired
    private ArticleProvider articleProvider;

    @Autowired
    private BibliographyFormatter bibliographyFormatter;

    public void processArticles() {
        List<Article> list = articleProvider.getArticles();

        String biblio = bibliographyFormatter.format(list);

        System.out.println(biblio);
    }
}
