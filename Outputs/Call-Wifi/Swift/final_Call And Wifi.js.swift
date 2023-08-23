import SwiftUI 
struct ContentView:View{ 
@State var value:Bool = false 
func call(number :Any)->Void {
var number
guard let number = URL(string: "tel://"+number) else { return } 
UIApplication.shared.open(number)
}
@State var onChangeText:String = null
 var body:some View {
                        VStack{

        TextField("useless placeholder",text:$val)
.frame(height:40,) 
// <Text>hello{onChangeText}</Text>
Button(action:{
call(onChangeText)



}
,label:{ 
 Text("Call") 
 } 
 ) 
Button(action:{
if let url = URL(string:UIApplicationOpenSettingsURLString) {
    if UIApplication.shared.canOpenURL(url) {
       let url =  UIApplication.shared.open(url, options: [:], completionHandler: nil)
    }
} 


}
,label:{ 
 Text("Open Wifi") 
 } 
 ) 
Image("https://reactnative.dev/img/tiny_logo.png").resizable().aspectRatio(contentMode: .fit)
.frame(width:50,height:50)
// <StatusBarstyle="auto"/>
// <Viewstyle={styles.container}><TextInputstyle={styles.input}onChangeText={(val)=>setText(val)}placeholder="useless placeholder"/><Text>hello{onChangeText}</Text><Buttoncolor={'#bdc3c7'}onPress={()=>{call(onChangeText)}}title="Call"/><ButtononPress={()=>{OpenAppSettings.openWiFi()}}title="Open Wifi"color="#841584"/><Imagestyle={styles.tinyLogo}source={{uri:'https://reactnative.dev/img/tiny_logo.png',}}/><StatusBarstyle="auto"/></View>
} 
 }
 } 
struct ContentView_Previews:PreviewProvider{ 
static var previews:some View{ 
ContentView() } 
 }