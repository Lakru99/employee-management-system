package edu.icet.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer taskId;
    private String taskName;
    private String taskDescription;
    private String taskStates;
}
