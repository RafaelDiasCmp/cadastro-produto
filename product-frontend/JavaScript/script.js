//Masks
$("#inputPrice").mask("000.000.000.000.000,00", { reverse: true });

function convertToNumber(priceFormat) {
    return priceFormat.replace(/\./g, '').replace(',', '.');
}

var products = [
    {
        id: 1,
        name: "Computador M1-TX",
        description: "Intel I7, 16GB, SSD 256, HD 1T",
        price: 4900,
        category: 1,
        promotion: true,
        new: true
    },
    {
        id: 2,
        name: "Computador M2-TX",
        description: "Intel I7, 32GB, SSD 512, HD 1T",
        price: 5900,
        category: 2,
        promotion: false,
        new: true
    },
    {
        id: 3,
        name: "Computador M1-T",
        description: "Intel I5, 16GB, HD 1T",
        price: 2900,
        category: 3,
        promotion: false,
        new: false
    },
];

var categories = [];

//OnLoad
loadCategories(); // Categorias precisa dar Load primeiro
loadProducts();


//Load all categories
function loadCategories() {
    $.ajax({
        url: "http://localhost:8080/categories", //AJAX para chamadas Síncronas
        type: "GET",
        async: false, //Chamada síncrona ---- Uma por vez
        success: (response) => { // Requisição JSON $
            categories = response;
            for (var cat of categories) {
                document.getElementById("selectCategory").innerHTML += `<option value= ${cat.id}>${cat.name}</option>`;
            }
        }
    });
}

//Load all products
function loadProducts() {

    $.getJSON("http://localhost:8080/products", (response) => { // Requisição JSON $

        products = response;
        for (let prod of products) {
            addNewRow(prod);
        }
    });


}

//save a product
function save() {



    var prod = {
        id: products.length + 1,
        name: document.getElementById("inputName").value,
        description: document.getElementById("inputDescription").value,
        price: convertToNumber(document.getElementById("inputPrice").value),
        idCategory: document.getElementById("selectCategory").value,
        promotion: document.getElementById("checkBoxPromotion").checked,
        newProduct: document.getElementById("checkBoxNewProduct").checked
    };

    $.ajax({
        url: "http://localhost:8080/products", //AJAX para chamadas Síncronas
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(prod), // Transforma em JSON
        async: true, //Chamada síncrona ---- Uma por vez
        success: (product) => { // Requisição JSON $
            addNewRow(product);
            products.push(product);

            document.getElementById("formProduct").reset();

        }
    });

}

//Add new Row
function addNewRow(prod) {
    var table = document.getElementById("productsTable");

    var newRow = table.insertRow();

    //Insert product id
    var idNode = document.createTextNode(prod.id);
    newRow.insertCell().appendChild(idNode);

    //Insert product name
    var nameNode = document.createTextNode(prod.name);
    newRow.insertCell().appendChild(nameNode);

    //Insert product description
    var descriptionNode = document.createTextNode(prod.description);
    var cell = newRow.insertCell();
    cell.className = "d-none d-md-table-cell";
    cell.appendChild(descriptionNode);

    //Insert product price
    var formatter = new Intl.NumberFormat("pt-BR", {
        style: "currency",
        currency: "BRL",
    });

    var priceNode = document.createTextNode(formatter.format(prod.price));
    newRow.insertCell().appendChild(priceNode);

    //Insert product category
    var categoryNode = document.createTextNode(categories[prod.idCategory - 1].name);
    newRow.insertCell().appendChild(categoryNode);

    //Insert product options
    var options = "";
    if (prod.promotion) {
        options = "<span class='badge bg-success me-1'>P</span>";
    }

    if (prod.newProduct) {
        options += "<span class='badge bg-primary'>L</span>";
    }

    cell = newRow.insertCell();
    cell.className = "d-none d-md-table-cell";
    cell.innerHTML = options;

}