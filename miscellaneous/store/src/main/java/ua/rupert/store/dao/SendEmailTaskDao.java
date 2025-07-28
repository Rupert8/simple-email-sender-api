package ua.rupert.store.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.rupert.store.entities.SendEmailTaskEntity;
import ua.rupert.store.repositories.SendEmailTaskRepository;

@RequiredArgsConstructor
@Component
public class SendEmailTaskDao {

    private final SendEmailTaskRepository sendEmailTaskRepository;

    @Transactional
    public SendEmailTaskEntity save(SendEmailTaskEntity taskEntity) {
        return sendEmailTaskRepository.save(taskEntity);
    }
}
