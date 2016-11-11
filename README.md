scala-processing
==

Template for making scala processing projects on Mac OSX.

### How to Install
* Install scala (`brew install scala`)
* Install [Processing 3](https://processing.org/download/) on your machine.
* Clone this repository (`git clone --depth=1 git@github.com:joannecheng/scala-processing.git && rm -rf scala-processing/.git`)

### How to run
If you installed Processing and Scala correctly, you can run the following command from `scala-processing/`

```
./scala-processing mySketch.scala
```

You should see the following:

<img src="https://github.com/joannecheng/scala-processing-template/blob/master/example.png?raw=true"
height="250">
</img>

### How to create a new sketch

* Edit the code from `class MySketch extends PApplet`, as you would a Processing application.
