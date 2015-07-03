// JavaScript Document
var http=require('http');
var serv=http.createServer(function(req,res){
	res.writeHead(200,{'Content-Type':'text/html'});
	res.end('<marquee>Smashing here</marquee>');
});
serv.listen(3000);