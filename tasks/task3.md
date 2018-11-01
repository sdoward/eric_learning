## Task 3 - Data modeling and Json

Java classes can generally be split into 2 types. Data classes and functional classes. Other programming languages make this distinction but java does not. A data class only contains information but doesn't do anything. So a data class called `Person` might have information such as name, age etc. We will be focusing on data classes in this task
 
We will both be making the same app but with different data. Data is typically transfered from server to app in json format


Sam is going to display a list of breweries. The data will be pulled from `https://api.openbrewerydb.org/breweries`. The json object is represent like so

```
  {
    id: 299,
    name: "Almanac Beer Company",
    brewery_type: "micro",
    street: "651B W Tower Ave",
    city: "Alameda",
    state: "California",
    postal_code: "94501-5047",
    country: "United States",
    longitude: "-122.306283180899",
    latitude: "37.7834497667258",
    phone: "4159326531",
    website_url: "http://almanacbeer.com",
    updated_at: "201-08-23T23:24:11.758Z"
  }
```

This is modeled in a java data class in [Brewery](https://github.com/sdoward/eric_learning/blob/master/samsmodule/src/main/java/sdoward/com.samsmodule/Brewery.java)


Eric is going to display a list of beers. The data will be pulled from `https://api.punkapi.com/v2/beers`. The json object is represent like so

```
{
    "id":1,
    "name":"Buzz",
    "tagline":"A Real Bitter Experience.",
    "first_brewed":"09/2007",
    "description":"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.",
    "image_url":"https://images.punkapi.com/v2/keg.png",
    "abv":4.5,
    "attenuation_level":75,
    "brewers_tips":"The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.",
    "contributed_by":"Sam Mason <samjbmason>"
}
```

### Objective

Create data classes that represent the json object that will be received from the server.

### Steps to complete
1. Create a new java class in ericsmodule name it with a word that describes the data. I named mine `Brewery`
2. Go through each line of your json object and add a class member to the class that you created. In my class  [Brewery](https://github.com/sdoward/eric_learning/blob/master/samsmodule/src/main/java/sdoward/com/samsmodule/Brewery.java). I used 4 primitive data types: int, String, double and long. Use [this guide](https://cs.fit.edu/~ryan/java/language/java-data.html) to figure out which primative data types you should use. But use String instead of char
3. Commit locally
4. Push your changes to github

**Note:** make sure the names of the class memeber are exactly the same as the names in the json object. 