package com.maku.amalitechmakumazakpeassessment.ui.screen.pagination

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    suspend fun reset()
}
