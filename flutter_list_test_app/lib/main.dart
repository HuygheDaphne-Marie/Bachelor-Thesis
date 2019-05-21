import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter List Test App',
      home: WordList(),
    );
  }
}

class WordList extends StatefulWidget {
  @override
  _WordListState createState() => _WordListState();
}

class _WordListState extends State<WordList> {
  List<String> _wordList = ["the","of","and","a","to","in","is","you","that",
  "it","he","was","for","on","are","as","with","his","they","I","at","be","this",
  "have","from","or","one","had","by","word","but","not","what","all","were","we",
  "when","your","can","said","there","use","an","each","which","she","do","how",
  "their","if","will","up","other","about","out","many","then","them","these","so",
  "some","her","would","make","like","him","into","time","has","look","two","more",
  "write","go","see","number","no","way","could","people","my","than","first","water",
  "been","call","who","oil","its","now","find","long","down","day","did","get","come",
  "made","may","part"];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("List test app"),
      ),
      body: ListView.builder(
        itemBuilder: (context, index) {
          if (index < _wordList.length) {
            return new ListTile(
              title: new Text(_wordList[index]),
            );
          }
        }
      ),
    );
  }
}
