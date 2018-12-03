package com.rsowell.dungeonbuilder.domain

import javax.persistence.Entity

@Entity
data class DungeonType(
        val name: String
) : BaseEntity()