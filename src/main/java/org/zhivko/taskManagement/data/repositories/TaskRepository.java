package org.zhivko.taskManagement.data.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.zhivko.taskManagement.data.entities.Task;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
