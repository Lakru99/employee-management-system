package edu.icet.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {
    private Integer adminId;
    private String adminEmail;
    private String adminPassword;
}
