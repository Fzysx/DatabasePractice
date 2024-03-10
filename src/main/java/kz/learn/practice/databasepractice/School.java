package kz.learn.practice.databasepractice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "School")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "students_count", nullable = false)
    private int studentsCount;

    public School(String name, int studentsCount) {
        this.name = name;
        this.studentsCount = studentsCount;
    }
}
