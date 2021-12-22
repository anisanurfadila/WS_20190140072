function wsconsume(){
    var nim = document.getElementsById('nim');
    var nama = document.getElementsById('nama');
    var alamat = document.getElementsById('alamat');
    var programstudi = document.getElementsById('programstudi');
    var fakultas = document.getElementsById('fakultas');


    fetch('http://localhost:8080/listjson')
    .then((response)=>{return response.json()})
    .then((result)=>{
        nim.innerHTML = result.nim;
        nama.innerHTML = result.nama;
        alamat.innerHTML = result.alamat;
        programstudi.innerHTML = result.programstudi;
        fakultas.innerHTML = result.fakultas;
        console.log(result);
    });
}

