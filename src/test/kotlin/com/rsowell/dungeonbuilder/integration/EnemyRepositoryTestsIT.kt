package com.rsowell.dungeonbuilder.integration

import com.rsowell.dungeonbuilder.data.EnemyRepository
import com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
@Tag("IT")
class EnemyRepositoryTestsIT(@Autowired val enemyRepository: EnemyRepository) {

    @Test
    fun `When enemy is saved then it exists in the database`() {
        val enemy = Enemy("Bob", 1.0, 1.0)
        enemyRepository.save(enemy)

        assertThat(enemyRepository.findAll()).hasSize(1)
    }

}
