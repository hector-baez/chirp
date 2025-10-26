package com.hbaez.chirp.api.mappers

import com.hbaez.chirp.api.dto.AuthenticatedUserDto
import com.hbaez.chirp.api.dto.UserDto
import com.hbaez.chirp.domain.model.AuthenticatedUser
import com.hbaez.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}
fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}