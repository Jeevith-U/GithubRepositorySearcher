package com.jeevith.grs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GitHubRepoSearchRequest {

    private String query;
    private String language;
    private String sort;
}
