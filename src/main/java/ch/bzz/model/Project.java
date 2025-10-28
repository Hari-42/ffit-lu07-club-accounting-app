package ch.bzz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private String projectName;
    private String passwordHash;
}