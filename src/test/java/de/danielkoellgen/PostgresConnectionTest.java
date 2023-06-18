package de.danielkoellgen;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

@QuarkusTest
public class PostgresConnectionTest {

    @Inject
    TestEntityRepository testEntityRepository;

    @BeforeEach
    @Transactional
    public void setUp() {
        testEntityRepository.deleteAll();
    }

    @Test
    @Transactional
    public void testFindById() {
        // given
        testEntityRepository.persist(new TestEntity(1));

        // when
        TestEntity testEntity = testEntityRepository.findById(1);

        // then
        Assertions.assertNotNull(testEntity);
        Assertions.assertEquals(1, testEntity.getId());
    }
}
