package kz.learn.practice.databasepractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findByName(String name);
    @Query("SELECT SUM(s.studentsCount) FROM School s")
    int getTotalStudentCount();
}
