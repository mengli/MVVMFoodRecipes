package study.android.foodrecipes.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    val pk: String,
    val title: String?,
    val publisher: String?,
    val featured_image: String?,
    val rating: Int,
    val source_url: String?,
    val description: String?,
    val cooking_instructions: String?,
    val ingredients: List<String>?,
    val date_added: String?,
    val date_updated: String?
) : Parcelable