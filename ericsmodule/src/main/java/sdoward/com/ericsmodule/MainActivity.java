package sdoward.com.ericsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Beer beer = (Beer) new Retrofit.Builder()
            .baseUrl("https://api.punkapi.com/v2/beers/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BeerService.class);

    TextView textView;

    Gson gson = new Gson();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.myTextView);
       BeerService.getBeers()
               .enqueue(new Callback<List<Beer>>() {
                   @Override
                   public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
                       List<Beer> beer= response.body();
                       String beerList="";
                       for (Beer beers: beer ){
                           beerList=beerList + beers.name + System.getProperty("line.separator");
                       }
                       textView.setText(beerList);

                   }

                   @Override
                   public void onFailure(Call<List<Beer>> call, Throwable t) {
                       Log.d("Main activity","unable to get data" );

                   }
               });
    }
}
