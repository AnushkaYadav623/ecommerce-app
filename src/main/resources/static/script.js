const API = "http://localhost:8080";

async function addProduct() {
    const name = document.getElementById("productName").value;
    const price = document.getElementById("productPrice").value;

    await fetch(`${API}/products`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, price })
    });

    loadProducts();
}

async function loadProducts() {
    const response = await fetch(`${API}/products`);
    const products = await response.json();

    const productList = document.getElementById("productList");
    productList.innerHTML = "";

    products.forEach(product => {
        productList.innerHTML += `
            <div class="product-item">
                <strong>${product.name}</strong><br>
                ₹${product.price}
            </div>
        `;
    });
}

async function addUser() {
    const name = document.getElementById("userName").value;
    const email = document.getElementById("userEmail").value;

    await fetch(`${API}/users`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, email })
    });

    alert("User Added!");
}

loadProducts();