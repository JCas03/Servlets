package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
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
