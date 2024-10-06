package Hoseo.GP.StudyMatching.entity;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;   // 모집 제목

    @Lob    // 긴 텍스트를 저장할 수 있도록 함
    private String content; // 모집 내용

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
