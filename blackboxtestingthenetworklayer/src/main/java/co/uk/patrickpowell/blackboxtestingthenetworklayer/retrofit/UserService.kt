package co.uk.patrickpowell.blackboxtestingthenetworklayer.retrofit

import co.uk.patrickpowell.blackboxtestingthenetworklayer.User
import retrofit2.Response
import retrofit2.http.GET

interface UserService {

    @GET("user")
    suspend fun get(): Response<User>
}