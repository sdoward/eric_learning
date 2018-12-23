## Task 10 - Model, View, Presenter (MVP) pattern

This task introduces the MVP design pattern. A design pattern is a way to structure code. MVP is a pretty popular 
pattern on android. The main advantage to MVP is that it makes our code testible. By testible I mean we can write tests
in code that will automatically check to see if the app works. We will go deeper into testing and write tests in the 
next task.

MVP stands for the following...

- Presenter: This is the class that contains the logic to display the data. In our case it controls getting the data
from the service, makes an asyncronous call and tells the view so display the data.
- View: This is an interface that the Activity implements. This receives the data from the Presenter and sets it on the 
android-views(recyclerView, textView) etc
- Model: This is how we get access from to data. This could be from a database, from a server etc. In our case we only
get data from the service.

You can read more about the pattern here https://medium.com/cr8resume/make-you-hand-dirty-with-mvp-model-view-presenter-eab5b5c16e42

### Steps to complete

Do the same as I have done in this commit