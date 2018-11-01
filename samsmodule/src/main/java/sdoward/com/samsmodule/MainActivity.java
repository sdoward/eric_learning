package sdoward.com.samsmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private String breweryJson = "  {id: 299,name: \"Almanac Beer Company\",brewery_type: \"micro\",street: \"651B W Tower Ave\",city: \"Alameda\",state: \"California\",postal_code: \"94501-5047\",country: \"United States\",longitude: \"-122.306283180899\",latitude: \"37.7834497667258\",phone: \"4159326531\",website_url: \"http://almanacbeer.com\",updated_at: \"201-08-23T23:24:11.758Z\"}";

    TextView textView;

    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Brewery brewery = gson.fromJson(breweryJson,  Brewery.class);
        textView.setText(brewery.name);
    }
}
