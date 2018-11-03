package sdoward.com.ericsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private String beerJson = "{\"id\":1,\"name\":\"Buzz\",\"tagline\":\"A Real Bitter Experience.\",\"first_brewed\":\"09/2007\",\"description\":\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\",\"image_url\":\"https://images.punkapi.com/v2/keg.png\",\"abv\":4.5,\"attenuation_level\":75,\"brewers_tips\":\"The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.\",\"contributed_by\":\"Sam Mason <samjbmason>\"}";
    TextView textView;

    Gson gson = new Gson();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.myTextView);
        Beer beer= gson.fromJson(beerJson, Beer.class);
        textView.setText(beer.name);
    }
}
