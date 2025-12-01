package com.hbaez.chirp.domain.exception

import java.lang.RuntimeException

class EmailNotVerifiedException: RuntimeException(
    "Email is not verified"
)