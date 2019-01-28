package com.rsowell.dungeonbuilder.domain

import javax.persistence.*

@Entity
data class User(val email: String) : BaseEntity() {
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name="dungeons")
    lateinit var dungeons: List<Dungeon>
}