package uz.iftixortalim.crmspring.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.iftixortalim.crmspring.model.Role;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private LocalDate createdAt;
    private Role role;
}
