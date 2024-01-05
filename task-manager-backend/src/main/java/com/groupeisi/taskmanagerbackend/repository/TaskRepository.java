package com.groupeisi.taskmanagerbackend.repository;

import com.groupeisi.taskmanagerbackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
