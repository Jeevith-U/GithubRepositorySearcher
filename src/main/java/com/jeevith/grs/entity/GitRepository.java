package com.jeevith.grs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "grs")
@ToString
public class GitRepository {

    @Id
    private long id ;
    private String name ;

    @Column(columnDefinition = "TEXT")
    private String description ;
    private String language ;
    private String owner ;
    private int stars ;
    private int forks ;
    @Column(name = "last_updated")
    private OffsetDateTime lastUpdated;




}
