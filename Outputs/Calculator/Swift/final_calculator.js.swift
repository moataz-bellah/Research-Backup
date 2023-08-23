import SwiftUI 
struct ContentView:View{ 
@State var value:Bool = false 
@State var currVal:Int = "0"
@State var operator:String = null
@State var prevVal:String = null
 func handleTap(type :Any,value :Any)->Void {
if (type==="number")
{
currVal = `${currVal}${value}`
}
if (type==="operator")
{
operator = value
prevVal = currVal
currVal = "0"
}
if (type==="clear")
{
currVal = "0"
operator = null
prevVal = null
}
if (type==="posneg")
{
currVal = `${parseFloat(currVal) * -1}`
}
if (type==="percentage")
{
currVal = `${parseFloat(currVal) * 0.01}`
}
if (type==="equal")
{
var current: parseFloat = parseFloat(currVal)
var previous: parseFloat = parseFloat(prevVal)
if (operator==="+")
{
currVal = previous+current
operator = null
prevVal = null
}
if (operator==="/")
{
currVal = previous/current
operator = null
prevVal = null
}
if (operator==="-")
{
currVal = previous-current
operator = null
prevVal = null
}
if (operator==="*")
{
currVal = previous*current
operator = null
prevVal = null
}
}
}
 var body:some View {
                        VStack{

        Text(currVal)
.font(.system().foregroundColor(Color."#fff")))Button(action:{
handleTap("clear")



}
,label:{ 
 Text("C") 
 } 
 ) 
Button(action:{
handleTap("posneg")



}
,label:{ 
 Text("+/-") 
 } 
 ) 
Button(action:{
handleTap("percentage")



}
,label:{ 
 Text("%") 
 } 
 ) 
Button(action:{
handleTap("operator","/")



}
,label:{ 
 Text("/") 
 } 
 ) 
// <Row><Buttontitle="C"theme="secondary"onPress={()=>{handleTap("clear")}}/><Buttontitle="+/-"theme="secondary"onPress={()=>{handleTap("posneg")}}/><Buttontitle="%"theme="secondary"onPress={()=>{handleTap("percentage")}}/><Buttontitle="/"theme="accent"onPress={()=>{handleTap("operator","/")}}/></Row>
Button(action:{
handleTap("number",7)



}
,label:{ 
 Text("7") 
 } 
 ) 
Button(action:{
handleTap("number",8)



}
,label:{ 
 Text("8") 
 } 
 ) 
Button(action:{
handleTap("number",9)



}
,label:{ 
 Text("9") 
 } 
 ) 
Button(action:{
handleTap("operator","*")



}
,label:{ 
 Text("x") 
 } 
 ) 
// <Row><Buttontitle="7"onPress={()=>{handleTap("number",7)}}/><Buttontitle="8"onPress={()=>{handleTap("number",8)}}/><Buttontitle="9"onPress={()=>{handleTap("number",9)}}/><Buttontitle="x"theme="accent"onPress={()=>{handleTap("operator","*")}}/></Row>
Button(action:{
handleTap("number",4)



}
,label:{ 
 Text("4") 
 } 
 ) 
Button(action:{
handleTap("number",5)



}
,label:{ 
 Text("5") 
 } 
 ) 
Button(action:{
handleTap("number",6)



}
,label:{ 
 Text("6") 
 } 
 ) 
Button(action:{



}
,label:{ 
 Text("-") 
 } 
 ) 
// <Row><Buttontitle="4"onPress={()=>{handleTap("number",4)}}/><Buttontitle="5"onPress={()=>{handleTap("number",5)}}/><Buttontitle="6"onPress={()=>{handleTap("number",6)}}/><Buttontitle="-"theme="accent"onPress={()=>this.handleTap("operator","-")}/></Row>
Button(action:{
handleTap("number",1)



}
,label:{ 
 Text("1") 
 } 
 ) 
Button(action:{
handleTap("number",2)



}
,label:{ 
 Text("2") 
 } 
 ) 
Button(action:{
handleTap("number",3)



}
,label:{ 
 Text("3") 
 } 
 ) 
Button(action:{
handleTap("operator","+")



}
,label:{ 
 Text("+") 
 } 
 ) 
// <Row><Buttontitle="1"onPress={()=>{handleTap("number",1)}}/><Buttontitle="2"onPress={()=>{handleTap("number",2)}}/><Buttontitle="3"onPress={()=>{handleTap("number",3)}}/><Buttontitle="+"theme="accent"onPress={()=>{handleTap("operator","+")}}/></Row>
Button(action:{
handleTap("number",0)



}
,label:{ 
 Text("0") 
 } 
 ) 
Button(action:{
handleTap("number",".")



}
,label:{ 
 Text(".") 
 } 
 ) 
Button(action:{
handleTap("equal")



}
,label:{ 
 Text("=") 
 } 
 ) 
// <Row><Buttontitle="0"size="double"onPress={()=>{handleTap("number",0)}}/><Buttontitle="."onPress={()=>{handleTap("number",".")}}/><Buttontitle="="theme="accent"onPress={()=>{handleTap("equal")}}/></Row>
} 
 }
 } 
struct ContentView_Previews:PreviewProvider{ 
static var previews:some View{ 
ContentView() } 
 }