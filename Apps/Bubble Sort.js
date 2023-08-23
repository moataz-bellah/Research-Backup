import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,Button,TextInput,Image } from 'react-native';
import {Linking} from 'react-native';
export default function App() {

    function fill100(){
        var inputArr = []
        for(i = 0;i<100;i++){
          inputArr.push(i)
        }
        let len = 100;
    for (i = 0; i < len; i++) {
        for (j = 0; j < len-1; j++) {
            if (inputArr[j] > inputArr[j + 1]) {
                let tmp = inputArr[j];
                inputArr[j] = inputArr[j + 1];
                inputArr[j + 1] = tmp;
            }
        }
    }

    }
    function fill1000(){
        var inputArr = []
        for(i = 0;i<1000;i++){
          arinputArrr.push(i)
        }
        let len = 1000;
    for (i = 0; i < len; i++) {
        for (j = 0; j < len-1; j++) {
            if (inputArr[j] > inputArr[j + 1]) {
                let tmp = inputArr[j];
                inputArr[j] = inputArr[j + 1];
                inputArr[j + 1] = tmp;
            }
        }
    }

    }
    function fill10000(){
        var inputArr = []
        for(i = 0;i<10000;i++){
          inputArr.push(i)
        }
        let len = 10000;
    for (i = 0; i < len; i++) {
        for (j = 0; j < len-1; j++) {
            if (inputArr[j] > inputArr[j + 1]) {
                let tmp = inputArr[j];
                inputArr[j] = inputArr[j + 1];
                inputArr[j + 1] = tmp;
            }
        }
    }

    }

    return (
      <View style = { styles.container }>
        
            <Button
            color={'#bdc3c7'}
            onPress={fill100}
            title="Sort 100" />
        <Button
    color={'#bdc3c7'}
    onPress={fill1000}
    title="Sort 1000" />
            <Button
    color={'#bdc3c7'}
    onPress={fill10000}
    title="Sort 10000" />
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
