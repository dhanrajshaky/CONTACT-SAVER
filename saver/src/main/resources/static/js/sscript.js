// Ensure currentTheme is defined and applied
console.log("javascript page loaded")
let currentTheme = getTheme(); // Get the initial theme from local storage
document.querySelector("html").classList.add(currentTheme); // Apply the theme to the page

// Change theme function
function changeTheme() {
    // Set to button
    const changeThemeButton = document.querySelector("#theme_change_button");
   
    if (changeThemeButton) {
        changeThemeButton.addEventListener("click", (event) => {
            const oldTheme = currentTheme;
            console.log("change theme button clicked");
            if (currentTheme === "dark") {
                currentTheme = "light";
            } else {
                currentTheme = "dark";
            }
            setTheme(currentTheme); // Save the new theme to local storage
                //remove current theme and add new theme 
            document.querySelector("html").classList.remove(oldTheme);
            // add new theme
            document.querySelector("html").classList.add(currentTheme);
 
            changeThemeButton.querySelector("span").textContent = currentTheme == "dark" ? "Light" : "Dark";
            
           
        });
    } else {
        console.error("Button with ID 'theme_change_button' not found");
    }
}

// Set theme to local storage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

// Get theme from local storage
function getTheme() {
    let theme = localStorage.getItem("theme");
    if (theme == null) {
        theme = "light"; // Default theme if no theme is found
    }
    return theme;
}

// Call the function to set up the event listener
changeTheme();
