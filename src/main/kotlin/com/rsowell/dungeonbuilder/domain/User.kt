package com.rsowell.dungeonbuilder.domain

import javax.persistence.Entity

@Entity
data class User(val cognitoId: String,
                val email: String
) : BaseEntity()