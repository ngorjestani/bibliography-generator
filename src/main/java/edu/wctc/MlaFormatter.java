package edu.wctc;

import java.util.List;

public class MlaFormatter implements BibliographyFormatter{
    public String format(List<Article> list) {
        StringBuilder sb = new StringBuilder();

        for(Article art : list) {
            sb.append(art.getAuthor());
            sb.append(", ");
            sb.append(art.getTitle());
            sb.append(": ");
            sb.append(art.getYear());
            sb.append("\n");
        }

        return sb.toString();
    }
}
