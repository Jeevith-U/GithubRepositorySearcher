package com.jeevith.grs.controller;

import com.jeevith.grs.entity.GitRepository;
import com.jeevith.grs.repository.GitRepositoryRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/api")
public class GitRepositoryController {

    @Autowired
    private GitRepositoryRepo repository ;

    private Logger log = LoggerFactory.getLogger(GitRepositoryController.class) ;

    @PostMapping("repositories")
    public ResponseEntity<GitRepository> saveGitRepository(@RequestBody GitRepository gitRepository) {

        GitRepository savedRepo = repository.save(gitRepository) ;
        log.info("Git repository {}", gitRepository);
        return ResponseEntity.ok(savedRepo);
    }
}
