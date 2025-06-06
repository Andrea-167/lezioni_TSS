let prodotti = ["Pasta", "Coca-Cola", "Acqua", "Pesto", "Prosciutto Cotto", "Passata di Pomodoro", "Monster", "Carne", "Pizza"];
let prezzi = [0.8, 1.39, 0.3, 3, 1.29, 1, 1.49, 5.20, 3.99];
let quants = [2, 2, 6, 1, 2, 2, 1, 1, 1];

let listaSpesa = document.getElementById("listaSpesa");

for (let i = 0; i < prodotti.length; i++) {
    let tr = document.createElement("tr");
    
    let td = document.createElement("td");

    td.innerHTML += `${prodotti[i]}`;

    let tr2 = document.createElement("tr2");
    
    let td2 = document.createElement("td2");

    td2.innerHTML += `${prezzi[i]}`;
    
    tr.appendChild(td);
    tr2.appendChild(td2);

    listaSpesa.appendChild(tr);
    listaSpesa.appendChild(tr2);
}

//non funziona