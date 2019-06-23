function wyswietl(){
    alert('hello world');
}
function wywolaj(){
            $.get( "/getValue", function( data ) {
              $('#mojePole').text(data);
            });
}