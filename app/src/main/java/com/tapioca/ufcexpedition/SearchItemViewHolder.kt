package com.tapioca.ufcexpedition

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.tapioca.ufcexpedition.fragment.ArticleDetailsFragment
import com.tapioca.ufcexpedition.model.Article

/**
 * Representa na UI um resultado da pesquisa.
 */
class SearchItemViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.search_item, parent, false)) {

    private var mTitleView: TextView? = null
    private var mImgView: ImageView? = null

    init {
        mTitleView = itemView.findViewById(R.id.item_title)
        mImgView = itemView.findViewById(R.id.item_img)
    }

    fun bind(article: Article, activity: AppCompatActivity) {
        mTitleView?.text = article.title
        //mImgView?.drawable

        // Setar o OnClickListener para navegar para o artigo representado por esse ViewHolder
        itemView.setOnClickListener {
            val articleFragment = ArticleDetailsFragment.newInstance()
            articleFragment.arguments = Bundle().apply {
                putString("title", article.title)
                putString("body", article.body)
            }
            activity.replaceFragment(articleFragment, R.id.fragment_container)
        }
    }
}