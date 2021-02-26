package todo_list.todo_list.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Getter @Setter
public class TodoItem {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String title;
    private boolean done;


}
