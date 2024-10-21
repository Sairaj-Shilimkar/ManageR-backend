package com.sairaj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private String color;

    private String description;

    private LocalDateTime creationDate;

    // Assuming you have a User entity for creator association
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    private int usageCount;

    private boolean isVisible;

    // Assuming bidirectional relationship is not required for now
    // @ManyToMany(mappedBy = "labels")
    // private Set<Issue> associatedIssues = new HashSet<>();
}
