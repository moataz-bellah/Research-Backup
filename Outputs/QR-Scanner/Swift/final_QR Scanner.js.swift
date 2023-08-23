import CodeScanner; 
import SwiftUI 
struct ContentView:View{ 
@State var value:Bool = false 
 var body:some View {
                        VStack{

        
          @State private var showingScanner = false
            Button(action: {
                self.showingScanner = true
            }) {
                Image(systemName: "qrcode")
                    .resizable()
                    .frame(width: 32, height: 32)
            }
            .sheet(isPresented: $showingScanner) {
                CodeScannerView(codeTypes: [.qr], simulatedData: "-") { result in
                     switch result {
                     case .success(let code):
                         print(code)
                     case .failure(let error):
                         print(error)
                     }
                     self.showingScanner = false
                 }
            }
            // <StatusBarstyle="auto"/>
// <Viewstyle={styles.container}><RNCameraref={ref=>{this.camera=ref;}}style={{flex:1,width:'100%',}}onGoogleVisionBarcodesDetected={this.barcodeRecognized}></RNCamera><StatusBarstyle="auto"/></View>
} 
 }
 } 
struct ContentView_Previews:PreviewProvider{ 
static var previews:some View{ 
ContentView() } 
 }