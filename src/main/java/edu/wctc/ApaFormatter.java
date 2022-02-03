package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApaFormatter implements BibliographyFormatter{
    @Override
    public String format(List<Article> list) {
        StringBuilder sb = new StringBuilder();

        for(Article art : list) {
            sb.append(art.getTitle());
            sb.append(", ");
            sb.append(art.getAuthor());
            sb.append("; ");
            sb.append(art.getYear());
            sb.append("\n");
        }

        return sb.toString();
    }
}
