package br.com.rafael.workhipster.model

import com.google.gson.annotations.SerializedName

data class Usuario(
    @SerializedName(value = "id")
    val id: String,
    @SerializedName(value = "name")
    val name: String,
    @SerializedName(value = "pwd")
    val pwd: String
)