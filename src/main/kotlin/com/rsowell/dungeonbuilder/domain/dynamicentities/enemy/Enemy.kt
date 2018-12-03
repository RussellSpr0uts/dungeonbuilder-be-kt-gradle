package com.rsowell.dungeonbuilder.domain.dynamicentities.enemy

import com.rsowell.dungeonbuilder.domain.BaseEntity
import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicActor
import javax.persistence.*

@Entity
data class Enemy(override val name: String,
                 override val startPosX: Double,
                 override val startPoxY: Double) : BaseEntity(), DynamicActor {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var enemyType: EnemyType
}