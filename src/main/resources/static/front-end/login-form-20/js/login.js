document.getElementById("login").addEventListener("submit", async function(event) {
    event.preventDefault();
    const username = document.getElementById("username").value;
    const password = document.getElementById("password-field").value;

    try {
        const response = await fetch("/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ username, password })
        });

        if (response.ok) {
            const data = await response.json();
            localStorage.setItem("token", data.token);
            window.location.href = "/teste.html";
        } else {
            document.getElementById("error").style.display = "inline";
            alert("Password ou User invalido.");
        }
    } catch (error) {
        console.error("Erro ao fazer login:", error);
    }
});