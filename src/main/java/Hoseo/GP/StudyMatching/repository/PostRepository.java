package Hoseo.GP.StudyMatching.repository;

import Hoseo.GP.StudyMatching.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 기본적인 CRUD 기능을 JpaRepository에서 상속받음
}
