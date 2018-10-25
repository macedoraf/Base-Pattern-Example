package br.com.rafael.workhipster.ui.usuario.adapter.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import br.com.rafael.workhipster.R
import br.com.rafael.workhipster.model.Usuario

class UsuarioHolder(itemView: View
val lblId:TextView = itemView.findViewById(R.id.lblId)) : RecyclerView.ViewHolder(itemView) {



    lateinit var usuario: Usuario


    fun bind(usuario: Usuario) {
        this.usuario = usuario
    }

}
