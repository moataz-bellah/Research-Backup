import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ImageView; 
import android.content.Intent; 
 import android.net.Uri; 
import android.content.Intent; 
 import android.provider.Settings; 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 import androidx.core.app.ActivityCompat; 
public class Call And Wifi.js extends AppCompatActivity { 
public void call(Object number)
{
Intent callIntent = new Intent(Intent.ACTION_DIAL); 
callIntent.setData(Uri.parse("tel:" + number));
startActivity(callIntent);
}
String onChangeText = null ;
@Override
            protected void onCreate (Bundle savedInstanceState){
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              final EditText input = (EditText) findViewById(R.id.input); 
String val = input.getText().toString(); 
// <Text>hello{onChangeText}</Text>
final Button Call = (Button) findViewById(R.id.Call); 
Call.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
call(onChangeText);
}
}
); 

final Button OpenWifi = (Button) findViewById(R.id.OpenWifi); 
OpenWifi.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS)); 
}
}
); 

final ImageView tinyLogo = (ImageView) findViewById(R.id.tinyLogo);
// <StatusBarstyle="auto"/>
// <Viewstyle={styles.container}><TextInputstyle={styles.input}onChangeText={(val)=>setText(val)}placeholder="useless placeholder"/><Text>hello{onChangeText}</Text><Buttoncolor={'#bdc3c7'}onPress={()=>{call(onChangeText)}}title="Call"/><ButtononPress={()=>{OpenAppSettings.openWiFi()}}title="Open Wifi"color="#841584"/><Imagestyle={styles.tinyLogo}source={{uri:'https://reactnative.dev/img/tiny_logo.png',}}/><StatusBarstyle="auto"/></View>
} 
 }