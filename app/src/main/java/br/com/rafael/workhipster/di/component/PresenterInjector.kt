package br.com.rafael.workhipster.di.component


import br.com.rafael.workhipster.di.module.NetworkModule
import br.com.rafael.workhipster.ui.usuario.presenter.UsuarioPresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface PresenterInjector {

    fun inject(presenterT: UsuarioPresenter)

    @Component.Builder
    interface Builder {

        fun build(): PresenterInjector

        fun networkModule(networkModule: NetworkModule): Builder


    }
}