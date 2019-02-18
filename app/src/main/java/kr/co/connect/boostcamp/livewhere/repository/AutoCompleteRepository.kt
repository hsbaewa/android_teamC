package kr.co.connect.boostcamp.livewhere.repository

import io.reactivex.Single
import kr.co.connect.boostcamp.livewhere.model.TmapResponse
import retrofit2.Response

interface AutoCompleteRepository {
    fun getAddress(query: String): Single<Response<TmapResponse>>
}