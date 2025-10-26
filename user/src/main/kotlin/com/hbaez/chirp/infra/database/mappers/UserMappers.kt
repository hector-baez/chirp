package com.hbaez.chirp.infra.database.mappers

import com.hbaez.chirp.domain.model.User
import com.hbaez.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}