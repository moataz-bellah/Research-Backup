import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ImageView; 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 import androidx.core.app.ActivityCompat; 
public class QR Scanner.js extends AppCompatActivity { 
@Override
            protected void onCreate (Bundle savedInstanceState){
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              myqrcodebarcodescanner qr = new myqrcodebarcodescanner();
// <StatusBarstyle="auto"/>
// <Viewstyle={styles.container}><RNCameraref={ref=>{this.camera=ref;}}style={{flex:1,width:'100%',}}onGoogleVisionBarcodesDetected={this.barcodeRecognized}></RNCamera><StatusBarstyle="auto"/></View>
} 
 }