package com.jeevith.grs.repository;

import com.jeevith.grs.entity.GitRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GitRepositoryRepo extends JpaRepository<GitRepository, Long> , JpaSpecificationExecutor<GitRepository> {
    Optional<GitRepository> findByRepoId(Long repoId);
}
