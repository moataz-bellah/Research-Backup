import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,Button,TextInput,Image } from 'react-native';
import {Linking} from 'react-native';
export default function App() {
    const [onChangeText, setText] = React.useState(0);
    return (
  
      <TextInput
          style={styles.input}
          onChangeText={setText}
          placeholder="Enter Your Name "
           />
            <Text>{onChangeText}</Text>
        <Button
        color={'#bdc3c7'}
          onPress={()=>{
            
              navigation.navigate('testScreen')
          }}
          title="Go to Counter Screen " />
        
    );
}

const styles = StyleSheet.create({
  input: {
    height: 40,
    margin: 12,
    borderWidth: 1,
  },
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    tinyLogo: {
    width: 50,
    height: 50,
  },
});

import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, Button, TextInput, Image } from 'react-native';
import { Linking } from 'react-native';
import { ActivityIndicator } from "react-native";

export default function App() {

    const [onChangeText, setText] = React.useState(0);

    return (

          <Text>{onChangeText}</Text>
          <Button color = { '#bdc3c7' }
            onPress = {() => {
                setText(onChangeText + 1)
                 setText(onChangeText + 1)
            }
        }
        title = "Count " / >
        <Button color = { '#bdc3c7' }
            onPress = {() => {
                navigation.navigate('testScreen')
            }
        }
        title = "Go to Main Screen " / >

       
    );
}

const styles = StyleSheet.create({
    input: {
        height: 40,
        margin: 12,
        borderWidth: 1,
    },
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    tinyLogo: {
        width: 50,
        height: 50,
    },
});
import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, Button, TextInput, Image } from 'react-native';
import { Linking } from 'react-native';

export default function App() {
    const [onChangeText, setText] = React.useState(0);

    return (

          <Button color = { '#bdc3c7' }
              onPress = {() => {
                  Linking.openURL("https://www.instagram.com/");
              }
          }
          title = "Open Instagram" / >
          <Button color = { '#bdc3c7' }
            onPress = {() => {
                 Linking.openURL("https://www.facebook.com/");
            }
        }
        title = "Open Facebook" / >
        <Button color = { '#bdc3c7' }
            onPress = {() => {
                Linking.openURL("https://www.youtube.com/");
            }
        }
        title = "Open Youtube" / >



    );
}

const styles = StyleSheet.create({
    input: {
        height: 40,
        margin: 12,
        borderWidth: 1,
    },
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    tinyLogo: {
        width: 50,
        height: 50,
    },
});