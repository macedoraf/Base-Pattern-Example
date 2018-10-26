package br.com.rafael.workhipster.ui.usuario.adapter.holder

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import br.com.rafael.workhipster.R
import br.com.rafael.workhipster.model.Usuario

class UsuarioHolder(itemView: View,
                    val lblId: TextView = itemView.findViewById(R.id.lblId),
                    val cardView: CardView = itemView.findViewById(R.id.cardView),
                    val lblNome: TextView = itemView.findViewById(R.id.lblNome),
                    val lblPassword: TextView = itemView.findViewById(R.id.lblPassword)
) : RecyclerView.ViewHolder(itemView) {


    lateinit var usuario: Usuario


    fun bind(usuario: Usuario) {
        this.usuario = usuario
        lblId.text = "Id. ${usuario.id}"
        lblNome.text = "Name ${usuario.name}"
        lblPassword.text = "Pwd ${usuario.pwd}"
    }

}
