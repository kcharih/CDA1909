<?php

// create who variable
$who      = 'Nordine';

// initialize SOAP client and call web service function
$client=new SoapClient('http://localhost/soap-hello/server.php?wsdl',['trace'=>1,'cache_wsdl'=>WSDL_CACHE_NONE]);
$resp  =$client->hello($who);

//echo $resp;

echo $client->__getLastResponse();

// dump response
//var_dump($resp);
?>