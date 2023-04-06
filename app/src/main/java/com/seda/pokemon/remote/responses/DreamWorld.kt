/*
 * Copyright (c)  - Irfanul Haq
 */

package com.seda.pokemon.remote.responses

import com.google.gson.annotations.SerializedName

data class DreamWorld(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any
)
