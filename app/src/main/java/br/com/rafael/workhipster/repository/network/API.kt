package br.com.rafael.workhipster.repository.network

import br.com.rafael.workhipster.model.Dados
import br.com.rafael.workhipster.model.Usuario
import io.reactivex.Observable
import retrofit2.http.GET

interface API {


    @GET(value = "pontotel-docs/data.json")
    fun getUsuarios(): Observable<Dados<Usuario>>
}