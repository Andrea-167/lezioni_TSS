let studenti = ["Claudio", "Vania", "Ludovica", "Andrea", "Glenda", "Edoardo", "Nicolò", "Sahar", "Ivan", "Jacopo"];

//stampare i nomi all'interno del div in una lista di li
//1. recupero la porzione di html sulla quale voglio lavorare
let demo = document.getElementById("demo");
console.log(demo);

// con InnerHTML cambio la prop del testo al suo interno. praticamente leggo e scrivo testo + html con questa prop
// demo.innerHTML = "<li>" + studenti[0] + "</li>";
for (let i = 0; i < studenti.length; i++) {
    demo.innerHTML += `<li>${studenti[i]}</li>`;
}

let docenti = ["Dario", "Oscar", "Luca", "Roberto", "Egle"];
let listaDoc = document.getElementById("listaDoc");
// docenti.forEach(doc =>{
//     if(doc == "Dario"){
//         listaDoc.innerHTML += `<li class="txtRed">${doc}</li>`;
//     }else{
//         listaDoc.innerHTML += `<li class="txtBlue">${doc}</li>`;
//     }
// })

// alternare i colori
for (let i = 0; i < docenti.length; i++) {
    if(i % 2 == 0){
        listaDoc.innerHTML += `<li class="txtRed">${docenti[i]}</li>`;
    }else{
        listaDoc.innerHTML += `<li class="txtBlue">${docenti[i]}</li>`;
    }   
}

let fotoGruppo = document.getElementById("fotoGruppo");
// fotoGruppo.innerHTML = "<img src='./img/fotoScuola.jpg' alt='foto aula' title='foto aula'>";

// fatto in modo serio
let img = document.createElement("img");
img.setAttribute("src", "./img/fotoScuola.jpg");
img.setAttribute("title", "aula");
img.setAttribute("class", "dimImg");

// ATT: img è figlio di fotoGruppo
fotoGruppo.appendChild(img);


