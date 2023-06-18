package de.danielkoellgen;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "test_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {

    @Id
    private Integer id;
}
