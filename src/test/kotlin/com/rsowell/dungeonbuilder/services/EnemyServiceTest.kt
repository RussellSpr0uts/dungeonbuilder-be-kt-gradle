package com.rsowell.dungeonbuilder.services

import com.rsowell.dungeonbuilder.data.EnemyRepository
import com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@Tag("UNIT")
internal class EnemyServiceTest {

    @MockK
    lateinit var enemyRepository: EnemyRepository

    @InjectMockKs
    lateinit var enemyService: EnemyService

    private val enemy = Enemy("Bob", 1.0, 1.0)

    @Test
    fun `When valid enemy is added then return list of valid enemy`() {
        every { enemyRepository.findAll() } returns listOf(enemy)
        val foundEnemies = enemyService.findAll()
        verify {enemyRepository.findAll()}
        assertThat(foundEnemies).isEqualTo(listOf(enemy))
    }

    @Test
    fun `When valid enemy is saved then return valid enemy`() {
        every { enemyRepository.save(enemy) } returns enemy
        val savedEnemy = enemyService.save(enemy)
        verify {enemyRepository.save(enemy)}
        assertThat(savedEnemy).isEqualTo(enemy)
    }

    @Test
    fun delete() {
        every { enemyRepository.delete(enemy) } returns Unit
        enemyService.delete(enemy)
        verify {enemyRepository.delete(enemy)}
    }

    @Test
    fun deleteById() {
        every { enemyRepository.deleteById(1L) } returns Unit
        enemyService.deleteById(1L)
        verify {enemyService.deleteById(1L)}
    }
}