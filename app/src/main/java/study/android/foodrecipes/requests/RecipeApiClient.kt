package study.android.foodrecipes.requests

import android.util.Log
import study.android.foodrecipes.models.Recipe
import study.android.foodrecipes.models.ResultWrapper
import study.android.foodrecipes.response.RecipeSearchResponse
import study.android.foodrecipes.utils.AUTHORIZATION
import java.io.IOException

object RecipeApiClient {

    private const val TAG = "RecipeApiClient"

    suspend fun searchRecipeApi(
            query: String,
            page: Int
    ): ResultWrapper<RecipeSearchResponse> {
        Log.d(TAG, "searchRecipeApi")
        return try {
            val searchResponse = ServiceGenerator
                    .getRecipeApi().searchRecipe(AUTHORIZATION, query, page)
            return if (searchResponse.isSuccessful) {
                Log.d(TAG, "Receive search response successfully.")
                ResultWrapper.Success(searchResponse.body()!!)
            } else {
                Log.e(TAG, "HTTP error: ${searchResponse.errorBody()}")
                ResultWrapper.GenericError(
                        searchResponse.code(),
                        searchResponse.errorBody()?.string()
                )
            }
        } catch (e: IOException) {
            Log.e(TAG, "Network error: ${e.message}")
            ResultWrapper.NetworkError
        }
    }

    suspend fun getRecipeApi(
            rid: String
    ): ResultWrapper<Recipe> {
        Log.d(TAG, "getRecipeApi")
        return try {
            val getResponse = ServiceGenerator.getRecipeApi().getRecipe(AUTHORIZATION, rid)
            return if (getResponse.isSuccessful) {
                Log.d(TAG, "Receive recipe response successfully.")
                ResultWrapper.Success(getResponse.body()!!)
            } else {
                Log.e(TAG, "HTTP error: ${getResponse.errorBody()}")
                ResultWrapper.GenericError(
                        getResponse.code(),
                        getResponse.errorBody()?.string()
                )
            }
        } catch (e: IOException) {
            Log.e(TAG, "Network error: ${e.message}")
            ResultWrapper.NetworkError
        }
    }
}