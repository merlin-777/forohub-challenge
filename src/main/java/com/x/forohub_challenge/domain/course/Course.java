package com.x.forohub_challenge.domain.course;

import com.x.forohub_challenge.domain.topic.Topic;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name="courses")
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "Id")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy="course")
    private Set<Topic> topics;

    @Override
    public String toString(){
        return "Curso(nombre="+this.name+", categoría="+this.category+")";
    }

}
