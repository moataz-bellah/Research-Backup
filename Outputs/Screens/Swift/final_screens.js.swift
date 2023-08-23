import SwiftUI 
struct ContentView:View{ 
@State var value:Bool = false 
@State var onChangeText:Int = 0
 var body:some View {
                        VStack{

        TextField("Enter Your Name ",text:$)
.frame(height:40,) 
Button(action:{
self.present(testScreen, animated: true, completion: nil) 



}
,label:{ 
 Text("Go to Counter Screen ") 
 } 
 ) 
@State var onChangeText:Int = 0
Button(action:{
onChangeText = onChangeText+1
onChangeText = onChangeText+1



}
,label:{ 
 Text("Count ") 
 } 
 ) 
Button(action:{
self.present(testScreen, animated: true, completion: nil) 



}
,label:{ 
 Text("Go to Main Screen ") 
 } 
 ) 
@State var onChangeText:Int = 0
Button(action:{
UIApplication.shared.open(URL(string: "https://www.instagram.com/")!, options: [:]) 



}
,label:{ 
 Text("Open Instagram") 
 } 
 ) 
Button(action:{
UIApplication.shared.open(URL(string: "https://www.facebook.com/")!, options: [:]) 



}
,label:{ 
 Text("Open Facebook") 
 } 
 ) 
Button(action:{
UIApplication.shared.open(URL(string: "https://www.youtube.com/")!, options: [:]) 



}
,label:{ 
 Text("Open Youtube") 
 } 
 ) 
} 
 }
 } 
struct ContentView_Previews:PreviewProvider{ 
static var previews:some View{ 
ContentView() } 
 }