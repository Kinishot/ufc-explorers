package com.tapioca.ufcexpedition.model

/**
 * Classe modelo para o artigo
 */
data class Article(var title: String, var body: String) {

    // companion object com ID estático, autoincrementado no init
    private var id: Int

    companion object {
        private var ID: Int = 0
    }

    init {
        id = ID
        ID += 1
    }

    fun getId() = id
    fun setId(nid: Int) { id = nid }
}