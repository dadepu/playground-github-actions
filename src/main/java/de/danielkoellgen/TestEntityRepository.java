package de.danielkoellgen;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestEntityRepository implements PanacheRepositoryBase<TestEntity, Integer> {
}
