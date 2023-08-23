import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,Button,TextInput,Image } from 'react-native';
import {Linking} from 'react-native';
export default function App() {  
  function call(number){
    Linking.openURL('tel:${number}');
  }
    const [onChangeText,setText] = React.useState(null);

    return (
      <View style = { styles.container }>
        <TextInput
          style={styles.input}
          onChangeText={(val)=>setText(val)}
          placeholder="useless placeholder"
           />
            <Text>hello  {onChangeText} </Text>

            <Button
            color={'#bdc3c7'}
            onPress={() => {
              call(onChangeText)
            }}
            title="Call" />
            <Button onPress={() => {
          OpenAppSettings.openWiFi()
        }}
        title="Open Wifi"
        color="#841584"/>
          <Image
       style={styles.tinyLogo}
       source={{
         uri: 'https://reactnative.dev/img/tiny_logo.png',
       }}
     />
        
        <StatusBar style = "auto"/>
        </View>
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
