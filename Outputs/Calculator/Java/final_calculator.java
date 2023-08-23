import android.widget.TextView; 
import android.view.View; 
import android.widget.Button; 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 import androidx.core.app.ActivityCompat; 
public class calculator.js extends AppCompatActivity { 
int currVal = "0" ;
String operator = null ;
String prevVal = null ;
public void handleTap(Object type,Object value){
if (type==="number")
{
currVal = `${currVal}${value}`;
}
if (type==="operator")
{
operator = value;
prevVal = currVal;
currVal = "0";
}
if (type==="clear")
{
currVal = "0";
operator = null;
prevVal = null;
}
if (type==="posneg")
{
currVal = `${parseFloat(currVal) * -1}`;
}
if (type==="percentage")
{
currVal = `${parseFloat(currVal) * 0.01}`;
}
if (type==="equal")
{
 parseFloat current = parseFloat(currVal);
 parseFloat previous = parseFloat(prevVal);
if (operator==="+")
{
currVal = previous+current;
operator = null;
prevVal = null;
}
if (operator==="/")
{
currVal = previous/current;
operator = null;
prevVal = null;
}
if (operator==="-")
{
currVal = previous-current;
operator = null;
prevVal = null;
}
if (operator==="*")
{
currVal = previous*current;
operator = null;
prevVal = null;
}
}
}
@Override
            protected void onCreate (Bundle savedInstanceState){
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              final TextView value = (TextView) findViewById(R.id.value);
value.setText(currVal);
final Button C = (Button) findViewById(R.id.C); 
C.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("clear");
}
}
); 

final Button +/- = (Button) findViewById(R.id.+/-); 
+/-.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("posneg");
}
}
); 

final Button % = (Button) findViewById(R.id.%); 
%.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("percentage");
}
}
); 

final Button / = (Button) findViewById(R.id./); 
/.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("operator","/");
}
}
); 

// <Row><Buttontitle="C"theme="secondary"onPress={()=>{handleTap("clear")}}/><Buttontitle="+/-"theme="secondary"onPress={()=>{handleTap("posneg")}}/><Buttontitle="%"theme="secondary"onPress={()=>{handleTap("percentage")}}/><Buttontitle="/"theme="accent"onPress={()=>{handleTap("operator","/")}}/></Row>
final Button 7 = (Button) findViewById(R.id.7); 
7.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",7);
}
}
); 

final Button 8 = (Button) findViewById(R.id.8); 
8.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",8);
}
}
); 

final Button 9 = (Button) findViewById(R.id.9); 
9.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",9);
}
}
); 

final Button x = (Button) findViewById(R.id.x); 
x.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("operator","*");
}
}
); 

// <Row><Buttontitle="7"onPress={()=>{handleTap("number",7)}}/><Buttontitle="8"onPress={()=>{handleTap("number",8)}}/><Buttontitle="9"onPress={()=>{handleTap("number",9)}}/><Buttontitle="x"theme="accent"onPress={()=>{handleTap("operator","*")}}/></Row>
final Button 4 = (Button) findViewById(R.id.4); 
4.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",4);
}
}
); 

final Button 5 = (Button) findViewById(R.id.5); 
5.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",5);
}
}
); 

final Button 6 = (Button) findViewById(R.id.6); 
6.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",6);
}
}
); 

final Button - = (Button) findViewById(R.id.-); 
-.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
}
}
); 

// <Row><Buttontitle="4"onPress={()=>{handleTap("number",4)}}/><Buttontitle="5"onPress={()=>{handleTap("number",5)}}/><Buttontitle="6"onPress={()=>{handleTap("number",6)}}/><Buttontitle="-"theme="accent"onPress={()=>this.handleTap("operator","-")}/></Row>
final Button 1 = (Button) findViewById(R.id.1); 
1.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",1);
}
}
); 

final Button 2 = (Button) findViewById(R.id.2); 
2.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",2);
}
}
); 

final Button 3 = (Button) findViewById(R.id.3); 
3.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",3);
}
}
); 

final Button + = (Button) findViewById(R.id.+); 
+.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("operator","+");
}
}
); 

// <Row><Buttontitle="1"onPress={()=>{handleTap("number",1)}}/><Buttontitle="2"onPress={()=>{handleTap("number",2)}}/><Buttontitle="3"onPress={()=>{handleTap("number",3)}}/><Buttontitle="+"theme="accent"onPress={()=>{handleTap("operator","+")}}/></Row>
final Button 0 = (Button) findViewById(R.id.0); 
0.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",0);
}
}
); 

final Button . = (Button) findViewById(R.id..); 
..setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("number",".");
}
}
); 

final Button = = (Button) findViewById(R.id.=); 
=.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 
handleTap("equal");
}
}
); 

// <Row><Buttontitle="0"size="double"onPress={()=>{handleTap("number",0)}}/><Buttontitle="."onPress={()=>{handleTap("number",".")}}/><Buttontitle="="theme="accent"onPress={()=>{handleTap("equal")}}/></Row>
} 
 }