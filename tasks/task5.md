## Task 5 - Retreiving data from the network

We will be using [Retrofit](https://square.github.io/retrofit/). This is a library that makes it easy to make networking calls. We can also configure it to use Gson to deserialize the data that we receive from the server.

You can look at the website above to understand how to configure and use it. As always look into samsmodule to figure out how to do this task


### Objective

Get data from a server and display basic information on the screen

### Steps to complete
1. Remove beerJson and use of Gson in MainActivity
2. Add internet permission tag to android manifest
3. Include retrofit and gson-converter in your module. Look at - [this file in samsmodule](https://github.com/sdoward/eric_learning/blob/master/samsmodule/build.gradle) to see how it is done
4. Create an interface that returns `Call<List<Beer>`. Add an annotation so retrofit can use it.
5. In MainActivity use `Retrofit` to create your `BeerService`
6. Get the list of beers from the beer service
7. Display the names of each beer in the TextView