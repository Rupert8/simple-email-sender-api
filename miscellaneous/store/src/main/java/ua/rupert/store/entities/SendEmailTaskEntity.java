package ua.rupert.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "send_email_entity")
public class SendEmailTaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(updatable = false, nullable = false)
    private Instant createdAt = Instant.now();

    private String destinationEmail;

    private String message;

    private Instant processedAt;

}
