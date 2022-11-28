package Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "user905")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    int id;

    @Column
    String name;

    @Column
    String password;

    @Column
    String email;

    @Column
    String country;

}
