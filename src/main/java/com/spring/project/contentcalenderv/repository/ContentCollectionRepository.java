package com.spring.project.contentcalenderv.repository;

import com.spring.project.contentcalenderv.model.Content;
import com.spring.project.contentcalenderv.model.Status;
import com.spring.project.contentcalenderv.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.spring.project.contentcalenderv.model.Status.IDEA;
import static com.spring.project.contentcalenderv.model.Type.ARTICLE;

@Repository
public class ContentCollectionRepository {

    public final List<Content> contentList = new ArrayList<>();
    public ContentCollectionRepository(){

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById (Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }



    public void save(Content content) {
    contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }
    public Content update(Content content, Integer id ) {
        return content;

    }

    public void delete(Integer id ) {
        contentList.removeIf(c -> c.id().equals(id));

    }

    public boolean existsById(Integer id) {

        contentList.stream().filter(c -> c.id().equals(id)).findFirst();
        return true;

    }


























































    @PostConstruct
    private void init() {
        Content content = new Content(
                1,
                "New Project",
                "Projects without borders",
                IDEA,
                ARTICLE,
                LocalDateTime.now(),
                null,
                "https://www.google.com"
        );
        Content content1 = new Content(
                2,
                "New Project 2",
                "Projects without borders 2",
                IDEA,
                ARTICLE,
                LocalDateTime.now(),
                null,
                "https://www.google.com.ng"
        );

        contentList.add(content);
        contentList.add(content1);
    }
}
