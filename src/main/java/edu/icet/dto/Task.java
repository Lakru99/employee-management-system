package edu.icet.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private Integer taskId;
    private String taskName;
    private String taskDescription;
    private String taskStates;
}
