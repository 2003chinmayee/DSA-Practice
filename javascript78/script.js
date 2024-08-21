const URL= "https://cat-fact.herokuapp.com/facts";

const btn=document.querySelector("#btn");
 const getFacts =async ()=>{
    console.log("getting data...");
    let response= await fetch(URL);
    console.log(response);
    let data = await response.json();
    console.log(data[0]);
    btn.innerHTML=data[0].text;

 };


 btn.addEventListener("click",getFacts);