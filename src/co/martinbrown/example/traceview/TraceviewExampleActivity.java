package co.martinbrown.example.traceview;

import android.app.Activity;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;

public class TraceviewExampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Debug.startMethodTracing("trace_example");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Debug.stopMethodTracing();
    }

    public void callLongFunction(View view) {

        for(int i = 0; i < 10000000; i++) ;
    }
}