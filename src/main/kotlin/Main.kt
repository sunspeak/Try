import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.roundToInt

val api = Retrofit.Builder()
    .baseUrl("https://www.anapioficeandfire.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(WeatherApi::class.java)

fun main() {

    var i: Int = 1

    while(api.getWeather(i)
            .execute()
            .body()
            ?.name != null)
    {
        println(
            api.getWeather(i)
                .execute()
                .body()
                ?.name
        )
        i++
    }

}