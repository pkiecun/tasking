package com.revature.tasking.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@EqualsAndHashCode
public class Task {
    @Id
    @GeneratedValue(generator = "tasks_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(allocationSize = 1, name = "tasks_id_seq")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "deadline")
    private String deadline;

    @Column(name = "complete")
    private boolean complete;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Task() {
    }

    public Task(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    public Task(long id, String title, String description, String deadline, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.user = user;
    }
}
