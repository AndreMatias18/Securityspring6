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
        localStorage.setItem("token", data.accessToken);

        
        fetch("/home", {
            headers: {
                "Authorization": "Bearer " + localStorage.getItem("token")
            }
        })
        .then(res => {
            if (res.status === 401) {
                window.location.href = "/login-page"; // token inválido
            } else {
                window.location.href = "/front-end/user/home.html"; // token ok
            }
        })
        .catch(err => {
            console.error("Erro ao validar token:", err);
            window.location.href = "/login-page";
        });
    }

    } catch (error) {
        console.error("Erro ao fazer login:", error);
    }
});