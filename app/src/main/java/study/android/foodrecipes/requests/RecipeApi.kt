package study.android.foodrecipes.requests

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import study.android.foodrecipes.response.RecipeResponse
import study.android.foodrecipes.response.RecipeSearchResponse

interface RecipeApi {

    @GET("get")
    suspend fun getRecipe(
        @Header("Authorization") token: String,
        @Query("id") id: String): Response<RecipeResponse>

    @GET("search")
    suspend fun searchRecipe(
        @Header("Authorization") token: String,
        @Query("query") query: String,
        @Query("page") page: Int
    ): Response<RecipeSearchResponse>
}