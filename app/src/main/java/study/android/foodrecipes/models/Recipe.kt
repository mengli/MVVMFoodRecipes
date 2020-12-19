package study.android.foodrecipes.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    @SerializedName("pk")
    @Expose()
    val pk: String,
    @SerializedName("title")
    @Expose()
    val title: String?,
    @SerializedName("publisher")
    @Expose()
    val publisher: String?,
    @SerializedName("featured_image")
    @Expose()
    val featuredImage: String?,
    @SerializedName("rating")
    @Expose()
    val rating: Int,
    @SerializedName("source_url")
    @Expose()
    val sourceUrl: String?,
    @SerializedName("description")
    @Expose()
    val description: String?,
    @SerializedName("cooking_instructions")
    @Expose()
    val cookingInstructions: String?,
    @SerializedName("ingredients")
    @Expose()
    val ingredients: List<String>?,
    @SerializedName("date_added")
    @Expose()
    val dateAdded: String?,
    @SerializedName("date_updated")
    @Expose()
    val dateUpdated: String?
) : Parcelable