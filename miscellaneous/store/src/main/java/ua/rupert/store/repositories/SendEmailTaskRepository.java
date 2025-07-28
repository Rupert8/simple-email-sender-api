package ua.rupert.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.rupert.store.entities.SendEmailTaskEntity;

@Repository
public interface SendEmailTaskRepository extends JpaRepository<SendEmailTaskEntity, Long> {
}
