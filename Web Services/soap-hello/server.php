<?php
// turn off WSDL caching
ini_set("soap.wsdl_cache_enabled","0");

function hello($who)
{
	return 'Hello ' . $who . ' , Welcome !';
}

// initialize SOAP Server
$server=new SoapServer("hello.wsdl");

// register available functions
$server->addFunction('hello');

// start handling requests
$server->handle();

?>