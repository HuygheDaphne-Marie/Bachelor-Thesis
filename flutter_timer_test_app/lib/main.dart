import 'package:flutter/material.dart';
import 'dart:async';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: TimerApp(),
    );
  }
}

class TimerApp extends StatefulWidget {
  TimerApp({Key key}) : super(key: key);

  @override
  _TimerAppState createState() => _TimerAppState();
}

class _TimerAppState extends State<TimerApp> {
  int _startTime = new DateTime.now().millisecondsSinceEpoch;
  int _miliseconds = 0;
  int _seconds = 0;
  int _minutes = 0;

  @override
  void initState() {
    super.initState();
    Timer.periodic(new Duration(milliseconds:  (1000~/60)), (Timer timer) {
      int timeDiff = new DateTime.now().millisecondsSinceEpoch - _startTime;
      double seconds = timeDiff / 1000;
      double minutes = seconds / 60;
      double displaySeconds = seconds % 60;
      double displayMilis = timeDiff % 1000 / 10;

      setState(() {
        _miliseconds = displayMilis.floor();
        _seconds = displaySeconds.floor();
        _minutes = minutes.floor();
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter Demo Home Page'),
      ),
      body: Center(
        child: new Text(
            "${_minutes < 10 ? "0"+_minutes.toString() : _minutes}:${_seconds < 10 ? "0"+_seconds.toString() : _seconds}:${_miliseconds < 10 ? "0"+_miliseconds.toString() : _miliseconds}"
        ),
      ),
    );
  }
}
