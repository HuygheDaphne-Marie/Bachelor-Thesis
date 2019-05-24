/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View} from 'react-native';

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Timer />
      </View>
    );
  }
}

class Timer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      milliseconds: 0,
      seconds: 0,
      minutes: 0,
    }

    let startTime = new Date().getTime();
    this.interval = setInterval(() => {
      let timeDiff = new Date().getTime() - startTime;
      let seconds = timeDiff / 1000;
      let minutes = Math.floor(seconds / 60);
      let displaySeconds = Math.floor(seconds % 60);
      let displayMilis = Math.floor(timeDiff % 1000 / 10);
    
      this.setState({
        milliseconds: displayMilis,
        seconds: displaySeconds,
        minutes: minutes,
      })
    }, 1000 / 60)
  }

  render() {
    let min = this.state.minutes;
    let sec = this.state.seconds;
    let milis = this.state.milliseconds;
    let timerText = `${min < 10 ? "0"+min : min}:${sec < 10 ? "0"+sec : sec}:${milis < 10 ? "0"+milis : milis}`
    return (
      <Text>{timerText}</Text>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
