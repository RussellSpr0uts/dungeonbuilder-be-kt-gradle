package com.rsowell.dungeonbuilder.domain.dynamicentities.enemy

import com.rsowell.dungeonbuilder.domain.BaseEntity
import javax.persistence.Entity

@Entity
data class EnemyType(val name: String) : BaseEntity()