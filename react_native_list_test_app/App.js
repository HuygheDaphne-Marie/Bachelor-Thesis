/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, View, Text, FlatList } from "react-native";



export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <WordList/>
      </View>
    );
  }
}

class WordList extends Component {
  constructor(props) {
    super(props)
    let words = ["the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part"];
    let wordKeys = [];
    words.forEach(word => {
      wordKeys.push({key: word})
    });

    this.state = {
      words: wordKeys
    }
  }

  render() {
    return (
      <FlatList data={this.state.words}
      renderItem={({item}) => <Text>{item.key}</Text>}/>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    // justifyContent: 'center',
    // alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
