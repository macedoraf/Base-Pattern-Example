package br.com.rafael.workhipster.model

import com.google.gson.annotations.SerializedName


/**
 * @param T = Tipo da lista que vai ser devolvida
 */
class Dados<T>(
    @SerializedName(value = "data")val dataList: List<T>
) {

}