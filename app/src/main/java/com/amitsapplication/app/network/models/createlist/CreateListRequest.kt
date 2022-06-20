package com.amitsapplication.app.network.models.createlist

import com.google.gson.annotations.SerializedName

data class CreateListRequest(

	@field:SerializedName("options")
	val options: CreateListRequestOptions? = null
)

data class CreateListRequestOptions(

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null
)
