## Naming Conventions and Annotations

With this task we will focus more on how we name things when programming and the conventions used.

- Class name: should start with uppercase letter and be a noun e.g. String, Color, Beer, Brewery
- Method name: should start with lowercase letter and be a verb e.g. actionPerformed(), main(), print(), println() etc.
- Variable name: should start with lowercase and each work starts with uppercase e.g. firstBrewed, brewersTips

In the current project your naming conventions are all correct apart from the Beerclass. This makes sense because if
we look back at [Task3](https://github.com/sdoward/eric_learning/blob/master/tasks/task3.md) we needed to match the names
of the data we receive from the server. But we can use annotationsfrom gson to tell it to match the nae from the server
data to the data we define. Annotations start with the @ symbol they look like this`@Something()`

We define this like so...


@SerializedName("brewery_type") String breweryType` This means we are naming out data correctly and mapping it from the 
server data. brewery_type goes to breweryType

### Objective

Renamed variables in the Beer class with the correct naming convention and add the annotations so we can still get the 
data from the server 

I wont add steps on this task but as always you can look at Brewery class to see how I did it

Remember to open a Pull Request so I can review your changes

 