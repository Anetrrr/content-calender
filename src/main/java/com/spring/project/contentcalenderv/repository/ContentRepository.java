package com.spring.project.contentcalenderv.repository;

import com.spring.project.contentcalenderv.model.Content;
import com.spring.project.contentcalenderv.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

   List<Content> findAllByTitleContains(String keyword);
   @Query("""
SELECT * FROM Content
where status = :status
""")
   List<Content> listByStatus(@Param("status") Status status);

}
