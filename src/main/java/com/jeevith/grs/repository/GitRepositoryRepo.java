package com.jeevith.grs.repository;

import com.jeevith.grs.entity.GitRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitRepositoryRepo extends JpaRepository<GitRepository, Long> {
}
