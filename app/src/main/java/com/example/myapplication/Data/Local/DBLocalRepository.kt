package com.example.myapplication.Data.Local

class DBLocalRepository(val favoritedao: FavMoviesDao) : LocalRepository {
    override suspend fun deleteByUserId(userId: Int) {
        favoritedao.deleteByUserId(userId)
    }

    override suspend fun updateListMovies(): List<FavMovies> {
        var name = favoritedao.getAll()

        return name
    }

    override suspend fun insert(movies: FavMovies) {

        favoritedao.insert(movies)

    }

    override suspend fun orderMovies() {
        favoritedao.getAll()
    }

    override suspend fun dropMovies() {
        favoritedao.deleteAll()
    }


}