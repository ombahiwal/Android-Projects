<?php
    $conn=mysqli_connect("localhost","u233978877_omkar","Omkar109","u233978877_fash");
    $name = $_POST["name"];
   $event = $_POST["event"];
   $roll1 = $_POST["roll"];
   $rln1 = $_POST["thrd"];
   $replace=array("x");
   $pendi="Pending";
   $find=array("'","*","true","false",":","shutdown","-","drop","admin","SELECT",";","*","/","SELECT","AND","OR","FROM","DROP","$","union","UNION","or","=","-","field","COLLATE","(",")");
    $name1=str_replace($find,$replace,$name);
	$rln=str_replace($find,$replace,$rln1);
$roll=str_replace($find,$replace,$roll1);
mysqli_select_db($conn,'u233978877_fash');
    $sql1="INSERT INTO cyclone(Name,Event,roll,fees,thrd) VALUES('$name1','$event','$roll','$pendi','$rln')";
$result = $conn->query($sql1);
     mysqli_close($conn);
?>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<head><title>You Are Registered to Cyclone!!</title></head>
<body>
<div style="margin:20px">
<h1>Registration Successful!</h1>
<h2> Please Contact <br>The Coordinators <br>for further details.</h2>
<h4><br>©2017 - Omkar Bahiwal.<br> Powered by omilap.xyz</h4>
</div>
</body>

</html>