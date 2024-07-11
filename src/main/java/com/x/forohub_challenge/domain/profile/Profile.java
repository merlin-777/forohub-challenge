package com.x.forohub_challenge.domain.profile;

import com.x.forohub_challenge.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="profiles")
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "Id")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "users_profiles",
            joinColumns = @JoinColumn(name = "profile_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users = new HashSet<>();

    @Override
    public String toString(){
        return "Perfil(name="+this.name+")";
    }

}
