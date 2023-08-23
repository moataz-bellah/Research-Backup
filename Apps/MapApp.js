import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,Button,TextInput,Image } from 'react-native';
import {Linking} from 'react-native';
export default function App() {
    function _goToYosemite() {
    openMap({ latitude: 37.865101, longitude: -119.538330 });
  }
  function openCamera(){
    <RNCamera
          style={{ flex: 1, alignItems: 'center' }}
          ref={ref => {
            this.camera = ref
          }}
        />
  }
    return (
      <View style = { styles.container }>
 
        <Button
        color={'#bdc3c7'}
          onPress={_goToYosemite}
          title="Click To Open Maps 🗺" />
          <Button
        color={'#bdc3c7'}
          onPress={openCamera}
          title="Click To Open Maps 🗺" />
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
