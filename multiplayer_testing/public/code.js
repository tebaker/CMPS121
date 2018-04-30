// connecting the client to the server on port 3000
var socket = io.connect('http://localhost:3000');

// testing key capture and data sending
document.onkeypress = function(e) {
    e = e || window.event;
    var charCode = (typeof e.which == "number") ? e.which : e.keyCode;
    if (charCode) {
        console.log("Character typed: " + String.fromCharCode(charCode));
        socket.emit('character', String.fromCharCode(charCode));
    }
};