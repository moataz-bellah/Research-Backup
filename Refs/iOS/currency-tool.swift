import SwiftUI 
struct ContentView:View{ 
@State var value:Bool = false 
@State var EGP:String = ""
@State var USD:String = ""
    func buttonClickListner(USD:Any)->Void {
var ans: Float = Number(USD)*15.7
if (USD==="")
EGP = ""
else EGP = USD+" USD equal "+ans+" EGP"
}

 var body:some View {
                        VStack{
                            TextField("Enter your currency ",text:$USD)        
        Text(EGP)
            .font(.system(size:12))
                            Button(action:{
                                    buttonClickListner(USD)

                            }
                            ,label:{
                                Text("Convert to EGP")
                            }
                            )
                        }
            }
    }
struct ContentView_Previews:PreviewProvider{ 
static var previews:some View{ 
ContentView() } 
 }