package edu.icet.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Leave {
    private Integer leaveId;
    private String leaveName;
    private LocalDate leaveDate;

}
