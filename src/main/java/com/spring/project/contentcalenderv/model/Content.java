package com.spring.project.contentcalenderv.model;

import jakarta.validation.constraints.NotBlank;
import jdk.jfr.DataAmount;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;



public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,

        @Column(value="description")
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {

    public Content {
    }
}