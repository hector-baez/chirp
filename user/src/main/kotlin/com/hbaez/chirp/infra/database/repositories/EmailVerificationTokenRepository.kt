package com.hbaez.chirp.infra.database.repositories

import com.hbaez.chirp.infra.database.entities.EmailVerificationTokenEntity
import com.hbaez.chirp.infra.database.entities.UserEntity
import java.time.Instant

interface EmailVerificationTokenRepository {
    fun findByToken(token: String): EmailVerificationTokenEntity?
    fun deleteByExpiresAtLessThan(now: Instant)
    fun findByUserAndUsedAtIsNull(user: UserEntity): List<EmailVerificationTokenEntity>
}