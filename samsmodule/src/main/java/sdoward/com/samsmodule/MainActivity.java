package sdoward.com.samsmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BreweriesService breweriesService = new Retrofit.Builder()
            .baseUrl("https://api.openbrewerydb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BreweriesService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        recyclerView.addItemDecoration(dividerItemDecoration);
        breweriesService.getBreweries()
                .enqueue(new Callback<List<Brewery>>() {
                    @Override
                    public void onResponse(Call<List<Brewery>> call, Response<List<Brewery>> response) {
                        List<Brewery> breweries = response.body();
                        BreweryAdapter breweryAdapter = new BreweryAdapter(breweries);
                        recyclerView.setAdapter(breweryAdapter);
                    }

                    @Override
                    public void onFailure(Call<List<Brewery>> call, Throwable throwable) {
                        Log.d("Main activity", "unable to get data", throwable);
                    }
                });
    }
}
