import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ImageView; 
import android.content.Intent;; 
import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ImageView; 
import widget.ProgressBar; 
import android.content.Intent;; 
import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ImageView; 
import android.content.Intent; 
 import android.net.Uri; 
import android.content.Intent; 
 import android.net.Uri; 
import android.content.Intent; 
 import android.net.Uri; 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 import androidx.core.app.ActivityCompat; 
public class screens.js extends AppCompatActivity { 
int onChangeText = 0 ;
@Override
            protected void onCreate (Bundle savedInstanceState){
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              final EditText input = (EditText) findViewById(R.id.input); 
String  = input.getText().toString(); 
final TextView Text1 = (TextView) findViewById(R.id.Text1);
Text1.setText(onChangeText);
final Button GotoCounterScreen = (Button) findViewById(R.id.GotoCounterScreen); 
GotoCounterScreen.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
Intent intent = new Intent(screens.js.this,testScreen.class); 
  startActivity(intent); 
}
}
); 

int onChangeText = 0 ;
final TextView Text2 = (TextView) findViewById(R.id.Text2);
Text2.setText(onChangeText);
final Button Count = (Button) findViewById(R.id.Count); 
Count.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
onChangeText = onChangeText+1;
onChangeText = onChangeText+1;
}
}
); 

final Button GotoMainScreen = (Button) findViewById(R.id.GotoMainScreen); 
GotoMainScreen.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
Intent intent = new Intent(screens.js.this,testScreen.class); 
  startActivity(intent); 
}
}
); 

int onChangeText = 0 ;
final Button OpenInstagram = (Button) findViewById(R.id.OpenInstagram); 
OpenInstagram.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/")); 
 startActivity(intent); 
}
}
); 

final Button OpenFacebook = (Button) findViewById(R.id.OpenFacebook); 
OpenFacebook.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")); 
 startActivity(intent); 
}
}
); 

final Button OpenYoutube = (Button) findViewById(R.id.OpenYoutube); 
OpenYoutube.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/")); 
 startActivity(intent); 
}
}
); 

} 
 }