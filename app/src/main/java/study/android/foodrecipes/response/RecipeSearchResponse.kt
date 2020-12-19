package study.android.foodrecipes.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import study.android.foodrecipes.models.Recipe

class RecipeSearchResponse {

    @SerializedName("count")
    @Expose()
    val count: Int = 0

    @SerializedName("next")
    @Expose()
    val next: String? = null

    @SerializedName("previous")
    @Expose()
    val previous: String? = null

    @SerializedName("results")
    @Expose()
    val results: List<Recipe>? = null

    override fun toString(): String {
        return "RecipeSearchResponse(count=$count, recipes=$results)"
    }
}