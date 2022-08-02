# springboot REST API with Spring Data - maven - mongodb
#this is customer order management project 
with : Spring Boot Rest API that use Spring Data MongoDB & Maven to make CRUD operations with MongoDB database
#before you run the appliaction ,create your database in mongodb 
in my project :
database_name : GestionCommande
GestionCommande collections_names : commande
commande documents :
  [{
  "_id": {
    "$oid": "62e861c1bf1da5be6568bcdd"
  },
  "produits": [
    {
      "title": "blue-tshirt",
      "prix": 600,
      "size": "XXL",
      "quantite": 2
    },
    {
      "title": "red-tshirt",
      "prix": 200,
      "size": "L",
      "quantite": 1
    }
  ],
  "date": "02/08/2022",
  "prixT": 800
},{
  "_id": {
    "$oid": "62e861c1bf1da5be6568bcde"
  },
  "produits": [
    {
      "title": "red-tshirt",
      "prix": 400,
      "size": "XL",
      "quantite": 2
    },
    {
      "title": "gloves",
      "prix": 100,
      "size": "M",
      "quantite": 1
    }
  ],
  "date": "03/08/2022",
  "prixT": 500
},{
  "_id": {
    "$oid": "62e89070e07fbb4ba038ba8c"
  },
  "produits": [
    {
      "title": "sneakers",
      "prix": 400,
      "size": "43",
      "quantite": 1
    },
    {
      "title": "belt",
      "prix": 300,
      "size": "normal",
      "quantite": 2
    }
  ],
  "date": "03/08/2022",
  "prixT": 1000,
  "_class": "com.yamani.spring.mongo.api.model.Commande"
}]
