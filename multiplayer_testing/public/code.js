// connecting the client to the server on port 3000
var socket = io.connect('http://localhost:3000');
socket.on('serverMsgEmit', clientReceiveMsg);

function clientReceiveMsg(data){
	console.log("Client Data Received: " + data.x + ", " + data.y);
}

// testing key capture and data sending
document.onkeypress = function(e) {
    e = e || window.event;
    var charCode = (typeof e.which == "number") ? e.which : e.keyCode;
    if (charCode) {
        console.log("Client Sent: " + String.fromCharCode(charCode));

        var charData = String.fromCharCode(charCode);

        socket.emit('charSentData', charData);
    }
};