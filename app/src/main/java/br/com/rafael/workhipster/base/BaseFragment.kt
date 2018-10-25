package br.com.rafael.workhipster.base

import android.os.Bundle
import android.support.v4.app.Fragment


abstract class BaseFragment<P : BasePresenter<BaseView>> : Fragment(), BaseView {

    protected lateinit var presenter: P


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = instantietePresenter()

    }

    protected abstract fun instantietePresenter(): P


}