db.getCollection('currency_info').find({})

db.getCollection('currency_info').insertMany([
     { countryName: "India", currencyType: 'INR', valInUSD: 1,curentcountrycurrency:73 }, 
     { countryName: "srilanka", currencyType: 'LKR', valInUSD: 1,curentcountrycurrency:184}, 
     { countryName: "pakistan", currencyType: 'PKR', valInUSD: 1 ,curentcountrycurrency:165}, 
     { countryName: "bangaladesh",currencyType:'BDT',valInUSD:1,curentcountrycurrency:84}
])
