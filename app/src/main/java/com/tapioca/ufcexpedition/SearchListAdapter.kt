package com.tapioca.ufcexpedition

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tapioca.ufcexpedition.model.Article

/**
 * Classe do adaptador para o ReciclerView da lista de resultados da pesquisa.
 * Essa classe recebe uma lista de artigos e é inserida no ReciclerView para traduzir a lista recebida em elementos de interface
 */
class SearchListAdapter(private val list: List<Article>, private val activity: AppCompatActivity) : RecyclerView.Adapter<SearchItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SearchItemViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: SearchItemViewHolder, position: Int) {
        val article: Article = list[position]
        holder.bind(article, activity)
    }

    override fun getItemCount(): Int = list.size
}