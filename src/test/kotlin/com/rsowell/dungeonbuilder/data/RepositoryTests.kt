package com.rsowell.dungeonbuilder.data

import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest

@ExtendWith(MockKExtension::class)
@SpringBootTest
class RepositoryTests {

    @RelaxedMockK
    lateinit var enemyRepository: EnemyRepository

    @Test
    fun `test testing lol`() {
        enemyRepository.hashCode()
        enemyRepository.findAll()
    }

}
