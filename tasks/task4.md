## Task 4 - Deserializing data and Dependencies (and a little of ui)

There is a lot in this task. Just do it step by step. Ask me if you get stuck.

> Serialization is the process of turning some object into a data format that can be restored later. People often serialize objects in order to save them to storage, or to send as part of communications. Deserialization is the reverse of that process -- taking data structured from some format, and rebuilding it into an object. Today, the most popular data format for serializing data is JSON.

In - [Task3](https://github.com/sdoward/eric_learning/blob/master/tasks/task3.md) we created a java object that represents a json object. This task focuses on getting the data from a json object and putting it into the java class that we previously created. Fortunately for us other people have already solved these problems. So we don't need to write the code to do it, so we will use code that somebody else has written.

People and companies often write code that others use. We can take that chuck of code and use it in our project. A chuck of code is normally called a "library" or a "dependency". There are 3 main libraries that change json to java...


1. [Gson](https://github.com/google/gson)
2. [Jackson](https://github.com/FasterXML/jackson)
3. [Moshi](https://github.com/square/moshi)

We are going to use Gson because it's the most commonly used.

### Objective

Deserialize a json object to a java object using gson and display data from that on screen

### Steps to complete
1. Include gson in your module. Look at - [this file in samsmodule](https://github.com/sdoward/eric_learning/blob/master/samsmodule/build.gradle) to see how it is done
2. In `MainActivity` use `Gson`  to map the beerJson (I added it to you MainActivity) to create a java object that you defined in task3
3. Get a reference to the TextView which is defined in your xml. 
4. Set the text of that TextView to the name of the beer java object that you have just deserialized 