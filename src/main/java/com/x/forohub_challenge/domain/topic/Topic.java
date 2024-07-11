package com.x.forohub_challenge.domain.topic;

import com.x.forohub_challenge.domain.answer.Answer;
import com.x.forohub_challenge.domain.course.Course;
import com.x.forohub_challenge.domain.user.User;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="courses")
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "Id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String message;

    private Boolean status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    private Course course;

    @OneToMany(mappedBy="topic")
    private Set<Answer> answer;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User author;

    @Override
    public String toString(){
        return "Tópico(título="+this.title+
                ", mensaje="+this.message+
                ", fecha_creación="+this.creationDate+
                ", estado="+this.status+
                ")";
    }
}
