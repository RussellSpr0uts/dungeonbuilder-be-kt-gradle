package com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter

import com.rsowell.dungeonbuilder.domain.BaseEntity
import javax.persistence.*

@Entity
data class PlayerCharacterType(val name: String) : BaseEntity()