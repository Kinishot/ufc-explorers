package com.tapioca.ufcexpedition.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tapioca.ufcexpedition.R
import kotlinx.android.synthetic.main.article_details_fragment.*

/**
 * Fragmento da página de detalhes do artigo
 */
class ArticleDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ArticleDetailsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.article_details_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Pega os argumentos para colocar o conteúdo na tela
        article_title.text = arguments?.getString("title")
        article_body.text = arguments?.getString("body")
    }

}
