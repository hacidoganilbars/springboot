
/*create schemaproduct database*/
use schemaproduct

/*Create Product collection*/
db.createCollection('product');

/*Dumping data for 'product' collection*/
db.getCollection('product').insert({
"name" : "Mobile 1",
"price" : 45.0,
"quantity" : 4.0,
"status" : true,
"date" : ISODate("2016-10-20T00:00:00.000Z")
});

db.getCollection('product').insert({
"name" : "Mobile 2",
"price" : 12.0,
"quantity" : 7.0,
"status" : true,
"date" : ISODate("2017-11-14T00:00:00.000Z")
});

db.getCollection('product').insert({
"name" : "Mobile 3",
"price" : 28.0,
"quantity" : 8.0,
"status" : true,
"date" : ISODate("2017-11-20T00:00:00.000Z")
});


db.getCollection('product').insert({
"name" : "Laptop 1",
"price" : 39.0,
"quantity" : 12.0,
"status" : false,
"date" : ISODate("2017-12-26T00:00:00.000Z")
});

db.getCollection('product').insert({
"name" : "Laptop 2",
"price" : 86.0,
"quantity" : 23.0,
"status" : true,
"date" : ISODate("2017-03-11T00:00:00.000Z")
});

db.getCollection('product').insert({
"name" : "Tivi 1",
"price" : 22.0,
"quantity" : 7.0,
"status" : true,
"date" : ISODate("2017-06-26T00:00:00.000Z")
});


db.getCollection('product').insert({
"name" : "Tivi 2",
"price" : 86.0,
"quantity" : 23.0,
"status" : false,
"date" : ISODate("2017-09-24T00:00:00.000Z")
});
