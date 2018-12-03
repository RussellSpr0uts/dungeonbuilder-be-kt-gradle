package com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter

import com.rsowell.dungeonbuilder.domain.BaseEntity
import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicActor
import javax.persistence.*
import javax.persistence.JoinColumn
import javax.persistence.FetchType


@Entity
data class PlayerCharacter(override val name: String,
                           override val startPosX: Double,
                           override val startPoxY: Double) : DynamicActor, BaseEntity() {

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var playerCharacterType: PlayerCharacterType

}