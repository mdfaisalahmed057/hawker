import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.R;



public class MainActivity extends AppCompatActivity {

    // Declaring the variable for image button
    ImageButton gfgImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing the variable for image button
        gfgImageButton = (ImageButton) findViewById(R.id.imageButton);

        // Below code is for setting a click listener on the image
        gfgImageButton.setOnClickListener(view -> {
            // Creating a toast to display the message
            Toast.makeText(MainActivity.this, "Welcome to GeeksforGeeks", Toast.LENGTH_SHORT).show();
            String url = "https://www.geeksforgeeks.org/";
            // Creating an explicit intent to open the
            // link stored in variable url
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
}
