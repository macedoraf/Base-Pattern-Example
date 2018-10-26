package br.com.rafael.workhipster.ui.usuario.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.rafael.workhipster.R
import br.com.rafael.workhipster.ui.usuario.adapter.holder.UsuarioHolder
import br.com.rafael.workhipster.ui.usuario.view.UsuarioView

class UsuarioAdapter(val view: UsuarioView) : RecyclerView.Adapter<UsuarioHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, container: Int): UsuarioHolder =
            UsuarioHolder(LayoutInflater.from(parent.context).inflate(R.layout.lst_usuario, parent, false))

    override fun getItemCount(): Int = view.getUsuarioList().size

    override fun onBindViewHolder(holder: UsuarioHolder, position: Int) {
        holder.bind(view.getUsuarioList()[position])

    }


}
