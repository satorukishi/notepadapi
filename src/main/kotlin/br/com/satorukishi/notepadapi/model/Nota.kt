package br.com.satorukishi.notepadapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

// No MongoDB, o ID é uma String (hash) e não um INT

@Document
data class Nota(@Id var id:String? = null, var titulo: String, var conteudo: String) {



}