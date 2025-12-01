package com.hbaez.chirp.infra.database.mappers

import com.hbaez.chirp.domain.model.EmailVerificationToken
import com.hbaez.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}