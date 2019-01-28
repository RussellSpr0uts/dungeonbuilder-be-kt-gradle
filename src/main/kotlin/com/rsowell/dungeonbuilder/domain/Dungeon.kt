package com.rsowell.dungeonbuilder.domain

import javax.persistence.*

@Entity
data class Dungeon (val name: String,
                    val tiles: String,
                    val dynamicEntities: String) : BaseEntity() {

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name="user")
    lateinit var user: User
//
//    @OneToOne(fetch= FetchType.LAZY)
//    @JoinColumn(name="id")
//    lateinit var tileSet: TileSet
//
//    @OneToOne(fetch= FetchType.LAZY)
//    @JoinColumn(name="id")
//    lateinit var dungeonType: DungeonType
}