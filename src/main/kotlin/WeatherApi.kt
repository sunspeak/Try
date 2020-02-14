import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherApi {

        @GET("api/houses/{url}")

    fun getWeather(@Path("url") url:Int ): Call<WeatherResponse>
}