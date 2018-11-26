package sdoward.com.ericsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    RecyclerView recyclerView;
    BeerService beerService = new Retrofit.Builder()
            .baseUrl("https://api.punkapi.com/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BeerService.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        recyclerView.addItemDecoration(dividerItemDecoration);
        beerService.getBeer()
               .enqueue(new Callback<List<Beer>>() {
                   @Override
                   public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
                       List<Beer> beer= response.body();
                       BeerAdapter beerAdapter= new BeerAdapter(beer);
                       recyclerView.setAdapter(beerAdapter);
                                         }

                   @Override
                   public void onFailure(Call<List<Beer>> call, Throwable throwable) {
                       Log.e("Main activity", "Unable to get data", throwable);

                   }
               });
    }
}
