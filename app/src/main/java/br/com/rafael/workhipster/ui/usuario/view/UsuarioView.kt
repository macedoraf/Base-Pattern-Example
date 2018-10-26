package br.com.rafael.workhipster.ui.usuario.view

import br.com.rafael.workhipster.base.BaseView
import br.com.rafael.workhipster.model.Usuario

interface UsuarioView : BaseView {

    fun update(listUsuario:List<Usuario> )

    fun showLoading()

    fun hideLoading()

    fun getUsuarioList(): List<Usuario>

    fun atualizaAdapter()

}
