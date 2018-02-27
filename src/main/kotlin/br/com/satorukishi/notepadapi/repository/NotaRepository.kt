package br.com.satorukishi.notepadapi.repository

import br.com.satorukishi.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

// <Nota, String> --> Tipo do Objeto, Tipo do Id
@Repository
interface NotaRepository : MongoRepository<Nota, String> {
    @Query("{}")
    fun all(): Stream<Nota>

    // A query é o nome do método, então aqui, vai buscar por Título
    fun findByTitulo(titulo: String): Nota

    /*
    // Busca por Titulo e Descricao
    fun findByTituloAndDescricao(titulo: String, descricao: String): Nota

    // Busca por Titulo ou Descricao
    fun findByTituloOrDescricao(titulo: String, descricao: String): Nota
    */


}