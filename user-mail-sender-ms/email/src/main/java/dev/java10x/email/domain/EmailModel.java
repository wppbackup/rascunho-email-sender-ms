package dev.java10x.email.domain;

import dev.java10x.email.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID userId;
    private String subject;
    @Column(columnDefinition = "BODY")
    private String emailBody;
    private String emailFrom; // 'from' and 'to' would cause conflict with SQL reserved keywords
    private String emailTo;
    private LocalDateTime sentDate;
    private Status status;
}
