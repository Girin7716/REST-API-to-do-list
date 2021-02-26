package todo_list.todo_list.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import todo_list.todo_list.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
