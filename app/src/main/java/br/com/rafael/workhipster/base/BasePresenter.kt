package br.com.rafael.workhipster.base

import br.com.rafael.workhipster.di.component.DaggerPresenterInjector
import br.com.rafael.workhipster.di.component.PresenterInjector
import br.com.rafael.workhipster.di.module.NetworkModule
import br.com.rafael.workhipster.ui.usuario.presenter.UsuarioPresenter
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<out V : BaseView>(protected val view: V) {


    private var compositeDisposable = CompositeDisposable()

    private val injector: PresenterInjector = DaggerPresenterInjector
        .builder()
        .networkModule(NetworkModule)
        .build()


    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is UsuarioPresenter -> injector.inject(this)


        }
    }

    fun addSubscription(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }


    open fun onStart() {}

    open fun onDestroyed() {}
}