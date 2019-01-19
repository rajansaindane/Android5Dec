package lookout.melayer.com.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            Toast.makeText(this, bundle.getString("id"), Toast.LENGTH_SHORT).show();
        }
    }
}
