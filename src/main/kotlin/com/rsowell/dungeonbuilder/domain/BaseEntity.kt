package com.rsowell.dungeonbuilder.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.domain.Persistable
import java.time.Instant
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity : Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null

    override fun getId(): Long? {
        return id
    }

    @Version
    private val version: Long? = null

    @field:CreationTimestamp
    val createdAt: Instant? = null

    @field:UpdateTimestamp
    val updatedAt: Instant? = null

    override fun isNew(): Boolean {
        return version == null
    }

    override fun toString(): String {
        return "BaseEntity(id=$id, version=$version, createdAt=$createdAt, updatedAt=$updatedAt, isNew=$isNew)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as BaseEntity
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}