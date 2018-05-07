<?php
session_start();
   $conn=mysqli_connect("localhost","u233978877_omkar","Omkar109","u233978877_fash");
$uid1 = $_POST['event'];
$pwd1 = $_POST['pass'];
$find=array("'","*","true","false",":","shutdown","-","admin","drop","SELECT",";","*","/","SELECT","AND","OR","FROM","DROP","$","union","UNION","or","=","-","field","COLLATE","(",")");
$replace=array("x");
$uid = str_replace($find,$replace,$uid1);
$pwd = str_replace($find,$replace,$pwd1);
$sql="SELECT * FROM userc WHERE event='$uid' AND password='$pwd'";
$result = $conn->query($sql);
if(!$row = $result->fetch_assoc()){
echo "Your Username or password is incorrect!";	
header("Location:loginpage.php");
echo "<br>Incorrect Password!,<br> Please Try again.";
}
else{
	$_SESSION['id']=$row['id'];
	$_SESSION['event']=$row['event'];header("Location:logged.php");

}
echo "Loading Please Wait... ";
?>