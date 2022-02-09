package com.leonlg.firstapp

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.DrawableCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.text_1
import kotlinx.android.synthetic.main.detail.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.detail)

        val product = Produits("Petits pois et carrotes","Cassegrain","Codes barres: 3083680085304","Quantité : 400 g (280 g net égoutté)","Vendu en : France, Japon, Suisse","Ingrédients : Petits pois 66%, eau, garniture 2,8% (salade, oignon grelot), sucre, sel, arôme naturel","Substances allergènes : Aucune","Additifs : Aucun")
        text_1.text = product.title
        text_2.text = product.cass
        codebarid.text = product.code
        quantiteid.text = product.quant
        text_5.text = product.pays
        text_6.text = product.ingr
        text_7.text = product.subs
        text_8.text = product.add




    } }



data class Produits(
    val title: String,
    val cass: String,
    val code: String,
    val quant: String,
    val pays: String,
    val ingr: String,
    val subs: String,
    val add: String,


)