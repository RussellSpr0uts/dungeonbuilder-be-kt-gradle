package com.rsowell.dungeonbuilder.services

import com.rsowell.dungeonbuilder.data.EnemyRepository
import com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EnemyService {

    @Autowired
    lateinit var enemyRepository : EnemyRepository

    fun findAll(): List<Enemy> = enemyRepository.findAll()

    fun save(enemy: Enemy) = enemyRepository.save(enemy)

    fun delete(enemy: Enemy) = enemyRepository.delete(enemy)

    fun deleteById(id: Long) = enemyRepository.deleteById(id)
}