import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,Button,TextInput,Image } from 'react-native';
import {Linking} from 'react-native';
export default function App() {
    return (
      <View style = { styles.container }>
       <RNCamera
          ref={ref => {
            this.camera = ref;
          }}
          style={{
            flex: 1,
            width: '100%',
          }}
          onGoogleVisionBarcodesDetected={this.barcodeRecognized}
        >
        </RNCamera>
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
