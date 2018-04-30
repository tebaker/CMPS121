// using 'express' along with 'socket.io' and 'node.js'
var express = require('express');

// setting app to express function and setting it to listen on port 3000
var app = express();
var server = app.listen(3000);

// telling the server to look in the folder 'public' for HTML and game code
app.use(express.static('public'));

console.log("my socket server is running");

// using socket
var socket = require('socket.io');

// linking io to the server that's listening on port 3000
var io = socket(server);

// setting up connection event and calling new connection
io.sockets.on('connection', newConnection);

// for every new connection, the socket.id will be unique for each client
function newConnection(socket){
	console.log('new connection: ' + socket.id);

	// if there's a character message from this client, trigger function charMsg
	socket.on('character', charMsg);

	function charMsg(data){
		console.log("from: " + socket.id + " -> " + data);
	}
}