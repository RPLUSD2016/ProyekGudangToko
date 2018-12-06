/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 function login() {
                                var json = {
                                    "IDtoko": document.getElementById("IDToko").value

                                };
                                var xmlhttp = new XMLHttpRequest();
        var url = "http://202.94.83.190:8080/165314035_RPL_GudangToko_Service2/webresources/StokToko/cariStokIDToko?idtoko="+IDToko.value;
        xmlhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                myFunction(this.responseText);
            }
        }
        xmlhttp.open("GET", url, true);
        xmlhttp.send();

        function myFunction(response) {
            var arr = JSON.parse(response);
            var i;
            var out = "<table id='tabel'><tr><th>ID Barang Toko</th><th>ID Toko</th><th>nama barang </th><th>jumlah barang</th><th>harga barang</th>";


            for (i = 0; i < arr.length; i++) {
                out += "<tr><td>" +
                        arr[i].idbarangToko + "</td><td>" + arr[i].idtoko + "</td><td>" +
                        arr[i].namaBarang + "</td><td>" +arr[i].jumlahBarang + "</td><td>" +
                        arr[i].hargaBarang;

            }
            out += "</table>";
            document.getElementById("tab").innerHTML = out;
        }
    }

