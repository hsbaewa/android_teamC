package kr.co.connect.boostcamp.livewhere.ui.main

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.co.connect.boostcamp.livewhere.model.RecentSearch
import kr.co.connect.boostcamp.livewhere.ui.main.adapter.RecentSearchRecyclerViewAdapter

@BindingAdapter("setRecyclerViewItems")
fun setRvItems(recyclerView: RecyclerView, itemList:List<RecentSearch>?){
    if(itemList!=null){
        (recyclerView.adapter as RecentSearchRecyclerViewAdapter).setData(itemList)
    }else{
        // TODO 데이터 정보 없음 처리.
    }
}