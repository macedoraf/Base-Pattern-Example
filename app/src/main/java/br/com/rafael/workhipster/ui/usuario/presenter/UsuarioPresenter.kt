package br.com.rafael.workhipster.ui.usuario.presenter

import br.com.rafael.workhipster.base.BasePresenter
import br.com.rafael.workhipster.repository.network.API
import br.com.rafael.workhipster.ui.usuario.view.UsuarioView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class UsuarioPresenter(view: UsuarioView) : BasePresenter<UsuarioView>(view) {


    @Inject
    lateinit var api: API


    fun getDadosUsuario() {
        view.showLoading()

        addSubscription(api.getUsuarios()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnTerminate { view.hideLoading() }
            .subscribe({ view.update() }, { view.onError(it) })
        )
    }

}