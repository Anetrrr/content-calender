package com.spring.project.contentcalenderv.repository;

import com.spring.project.contentcalenderv.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

   List<Content> findAllByTitleContains(String keyword);

}
