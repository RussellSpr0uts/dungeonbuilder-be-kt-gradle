package com.rsowell.dungeonbuilder.domain.dynamicentities.item

import com.rsowell.dungeonbuilder.domain.BaseEntity
import javax.persistence.Entity

@Entity
data class ItemType(val name: String) : BaseEntity()