// let message = document.querySelector('.subscription-message');
/*
let form = document.querySelector('.subscription');
form.onsubmit = function(evt) {
  // Инструкция ниже отменяет отправку данных
  evt.preventDefault();

};
*/


// let page = document.querySelector('.page');
// let button = document.querySelector('.theme-button');
//
// button.onclick = function () {
//     page.classList.toggle('light-theme');
//     page.classList.toggle('dark-theme');
//     console.log("I'm alive");
//
// }


//
// background:#ffffff url("img/bg-page.png") no-repeat top center

function changeTheme() {
    let page = document.querySelector('.page');
    let button = document.querySelector('.theme-button');

    page.classList.toggle('light-theme');
    page.classList.toggle('dark-theme');
    console.log("I'm alive");

}
