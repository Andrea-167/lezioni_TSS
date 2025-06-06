console.log("Ciao Dario, sei nella console");

// dichiaro una variabile
let mioNome = "Dario";
let miaEta = 36;
let presenza = true;
var corso = "TSPPI";
let litriAcqua = 0.75;

console.log("Il tipo della variabile mioNome è: ", typeof mioNome);
console.log("miaEta è: ", typeof miaEta);
console.log("litri acqua è: ", typeof litriAcqua);

//concateno delle stringhe
console.log("Ciao " + mioNome + " hai " + miaEta + " anni. Insegni nel corso di " + corso);

// ctrl + ù
// modo piu veloce per concatenare stringhe, con l'utilizzo del backtick
console.log(`Ciao ${mioNome} hai ${miaEta}`);

//ESEMPIO con i TIPI
let num1 = 10;
let num2 = 5;
console.log("La somma vale " + (num1 + num2));

let num3 = "25";
let num4 = "6";

let somma = parseInt(num3) + parseFloat(num4); //per renderli numeri usare Number, parseint, parseFloat
let prodotto = num3 * num4;
let differenza = num3 - num4;
let quoziente = num3 / num4;

console.log(somma);
console.log(prodotto);
console.log(differenza);
console.log(quoziente);

// let numeroCas = window.prompt("Inserisci numero"); // quello che recupero dall'utente sono sempre stringhe. 
// //Per renderlo numero devi castarlo con Number
// console.log(typeof numeroCas);

// let mioNumero = 50;
// let somma2 = numeroCas + mioNumero;
// console.log(somma2);

// ARRAY sono molto simili alla collection ArrayList di JAVA
let studenti = ["Claudio", "Vania", "Ludovica", "Andrea", "Glenda", "Edoardo", "Nicolò", "Sahar", "Ivan", "Jacopo", 4, true];

for(let i = 0; i < studenti.length; i++){
    console.log(studenti[i]);
    
}

studenti.forEach(studente => {
    console.log(studente);
    
});

for (const stud of studenti) {
    console.log(stud);
    
}

// anche qui ho prop e metodi legati all'oggetto Array
studenti.push("Dario");

studenti.sort().reverse();

studenti.pop(); //elimina l'ultimo elemento
studenti.shift();//elimina il primo elemento

// estraggo o sostituisco piu elementi con splice
// studenti.splice(2,5); //modifica l'array orginale

studenti.slice(2,6); //non modifica l'array originale

console.log(studenti);

let studentiEstratti = studenti.slice(2,6);

console.log(studentiEstratti);

//METODI PER CERCARE ELEMENTI

console.log(studenti.indexOf("Claudio")); //prima occorrenza
console.log(studenti.lastIndexOf("Claudio")); //ultima occorrenza


//metodo filter
let filtro = studenti.filter(nome => nome.length < 6); //questo restituisce un array
console.log(filtro);

let find = studenti.find(nome => nome.length > 6); //questo restituisce un singolo elemento
console.log(find);

//metodi per unire gli array e spaccare
let parole = ["Ciao", "Smartphone", "Mare", "Spiaggia", "Sole"];
console.log(parole.join("_"));



