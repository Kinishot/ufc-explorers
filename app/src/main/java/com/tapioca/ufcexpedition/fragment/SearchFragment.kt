package com.tapioca.ufcexpedition.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beust.klaxon.Klaxon
import com.tapioca.ufcexpedition.R
import com.tapioca.ufcexpedition.SearchListAdapter
import com.tapioca.ufcexpedition.model.Article
import kotlinx.android.synthetic.main.search_fragment.*

/**
 * Fragmento da página de pesquisa
 */
class SearchFragment : Fragment() {

    companion object {
        fun newInstance() = SearchFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Solução temporária: Artigos todos nesse arquivo
        val file = context!!.resources.assets.open("data.json")
        val articles = Klaxon().parseArray<Article>(file)!!

        // Configura o RecyclerView
        article_listview.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = SearchListAdapter(articles, activity as AppCompatActivity)
        }

    }

}
