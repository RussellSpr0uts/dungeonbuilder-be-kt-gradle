package com.rsowell.dungeonbuilder.domain.dynamicentities.item

import com.rsowell.dungeonbuilder.domain.BaseEntity
import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicActor
import javax.persistence.*

@Entity
data class Item(override val name: String,
                override val startPosX: Double,
                override val startPoxY: Double) : DynamicActor, BaseEntity() {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var itemType: ItemType
}