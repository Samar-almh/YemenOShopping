package com.yemen.oshopping.api


import com.yemen.oshopping.model.Category
import com.yemen.oshopping.model.DefaultResponse
import retrofit2.Call
import retrofit2.http.*


interface OshoppingApi {
    //post
    @FormUrlEncoded
    @POST("oshopping_api/api/category_api.php")
    fun postCategory(@Field("cat_name") cat_name: String): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("oshopping_api/api/product_api.php")
    fun pushProduct(
        @Field("product_id") product_id: Int?,
        @Field("product_name") product_name: String,
        @Field("yrial_price") yrial_price: Double,
        @Field("dollar_price") dollar_price: Double,
        @Field("vendor_id") vendor_id: Int,
        @Field("cat_id") cat_id: Int,
        @Field("product_details") product_details: String,
        @Field("product_img") product_img: String,
        @Field("product_date") product_date: String?,
        @Field("product_quantity") product_quantity: Int,
        @Field("product_discount") product_discount: Int

    ): Call<DefaultResponse>

    //get
    @GET("oshopping_api/api/product_api.php")
    fun fetchProduct(): Call<ProductResponse>

    @GET("oshopping_api/api/product_api.php")
    fun fetchProductByCategory(@Query("cat_id") category_id: Int): Call<ProductResponse>

    @GET("oshopping_api/api/product_api.php")
    fun searchProduct(@Query("query") query: String): Call<ProductResponse>

    @GET("oshopping_api/api/category_api.php")
    fun fetchCategory(): Call<CategoryResponse>

    //put
    @FormUrlEncoded
    @PUT("oshopping_api/api/category_api.php")
    fun updateCategory(@Field("cat_id") cat_id: Int?,@Field("cat_name") cat_name: String
    ): Call<DefaultResponse>

}