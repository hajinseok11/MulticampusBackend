/*

*/
alert("teststart");
let loginid = document.querySelector("#exampleInputEmail1");
let mymodal = document.querySelector("#exampleModal");
alert("test");

// mymodal.addEventListener("이벤트명", 함수)
mymodal.addEventListener("shown.bs.modal", function(){
    loginid.focus();
});