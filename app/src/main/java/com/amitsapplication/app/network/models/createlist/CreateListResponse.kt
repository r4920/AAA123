package com.amitsapplication.app.network.models.createlist

import com.google.gson.annotations.SerializedName

data class CreateListResponse(

	@field:SerializedName("data")
	val data: CreateListResponseData? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class CreateListResponseDataDataItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("role")
	val role: Int? = null,

	@field:SerializedName("isDeleted")
	val isDeleted: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("isActive")
	val isActive: Boolean? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("loginRetryLimit")
	val loginRetryLimit: Int? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class CreateListResponseData(

	@field:SerializedName("data")
	val data: List<CreateListResponseDataDataItem?>? = null,

	@field:SerializedName("paginator")
	val paginator: CreateListResponseDataPaginator? = null
)

data class CreateListResponseDataPaginator(

	@field:SerializedName("hasPrevPage")
	val hasPrevPage: Boolean? = null,

	@field:SerializedName("next")
	val next: Any? = null,

	@field:SerializedName("pageCount")
	val pageCount: Int? = null,

	@field:SerializedName("perPage")
	val perPage: Int? = null,

	@field:SerializedName("hasNextPage")
	val hasNextPage: Boolean? = null,

	@field:SerializedName("prev")
	val prev: Any? = null,

	@field:SerializedName("currentPage")
	val currentPage: Int? = null,

	@field:SerializedName("itemCount")
	val itemCount: Int? = null,

	@field:SerializedName("slNo")
	val slNo: Int? = null
)
