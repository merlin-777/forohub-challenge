package com.x.forohub_challenge.domain.answer;

import com.x.forohub_challenge.domain.topic.Topic;
import com.x.forohub_challenge.domain.user.User;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="courses")
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "Id")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    private String solution;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User author;

    @ManyToOne
    @JoinColumn(name="topic_id", nullable=false)
    private Topic topic;

    @Override
    public String toString(){
        return "Respuesta(mensaje="+this.message+
                ", fecha_creación="+this.creationDate+
                ", solución="+this.solution+
                ")";
    }
}
