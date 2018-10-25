package br.com.rafael.workhipster.base

import android.content.Context
import io.reactivex.annotations.Nullable

interface BaseView {

    fun getContext(): Context?

    fun onError(err: Throwable)

}