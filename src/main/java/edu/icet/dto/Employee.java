package edu.icet.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeEmail;
    private String employeePassword;
}
