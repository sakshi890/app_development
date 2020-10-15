import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleActivity extends Activity {
/** Called when the activity is first created. */
@Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    final TextView textView=(TextView)findViewById(R.id.textView1);
    final Button button1 =  (Button)findViewById(R.id.mybutton);

    //Implement listener for your button so that when you click the 
    //button, android will listen to it.             

     button1.setOnClickListener(new View.OnClickListener() {             
        public void onClick(View v) {                 
        // Perform action on click 
            String[] names = getResources().getStringArray(R.array.name);
            Random rand = new Random();
            int  n = rand.nextInt(names.length()-1);
            textView.setText(names[n]);

        }         });
    }
}
