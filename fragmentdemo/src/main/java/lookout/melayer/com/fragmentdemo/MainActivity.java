package lookout.melayer.com.fragmentdemo;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirstFragment fragment=new FirstFragment();
        addFragment(fragment);

    }

    void addFragment(Fragment fragment)
    {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
