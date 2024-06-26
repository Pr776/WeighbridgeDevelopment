package com.weighbridge.admin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Entity
@Data
public class StatusCodeMaster {
    @Id
    private String status_code;
    private String status_description;
}
