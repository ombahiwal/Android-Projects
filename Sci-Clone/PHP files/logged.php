<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
</head><body style="text-align:center;background:#333;color:white;margin:5px;">
<div>
<h2>Admin Area</h2>
</div>
<form action="logged.php" method="POST">
<input class="w3-input" type="search" name="search" placeholder="Search for Candidates.."required>
<input class="w3-input" type="submit" value="Search Query" >
</form>
<?php    

session_start();
 if(isset($_POST['rollnum'])){
	 $rolli1=$_POST['rollnum'];	 
	 $status1=$_POST['status'];
	 $find=array("'","*","true","false",":","shutdown","-","admin","drop","SELECT",";","*","/","SELECT","AND","OR","FROM","DROP","$","union","UNION","or","=","-","field","COLLATE","(",")");
$replace=array("x");
$rolli = str_replace($find,$replace,$rolli1);
$status = str_replace($find,$replace,$status1);
 }
$conn=mysqli_connect("localhost","u233978877_omkar","Omkar109","u233978877_fash");

if(!isset($_SESSION['id'])){
	header('location:loginpage.php');
	}else{echo $_SESSION['event'];echo "<br>";}

if(isset($_SESSION['id'])){
	

if(isset($_POST['search'])){
	   echo "<br>Search Results : <br>";
	$searchq=$_POST['search'];
	$searchq=preg_replace("#[^0-9a-z]#i","",$searchq);
	   mysqli_select_db($conn,'u233978877_fash');
if($_SESSION['event']!="head"){
	$query = mysqli_query($conn,"SELECT * FROM cyclone WHERE roll LIKE '%$searchq%' OR Name LIKE '%$searchq%' AND Event='{$_SESSION['event']}'") or die("could not search");
}else{
	$query = mysqli_query($conn,"SELECT * FROM cyclone WHERE roll LIKE '%$searchq%' OR Name LIKE '%$searchq%' OR Event LIKE '$$searchq%'") or die("could not search");
	
}$count = mysqli_num_rows($query);
if($count==0){
	$output = '<br>NO RESULTS!<br>';
}else
{while($row = mysqli_fetch_array($query)){
	$fname= $row['Name'];
	$lname=$row['Event'];
	$id = $row['id'];
	$roll=$row['roll'];
	$thrd=$row['thrd'];
			$fee=$row['fees'];

	$output .= '<div class="w3-card" style="color:#333;background:#ffffcc"> ID: '.$id.'<br>UID: ' .$roll.'<br>Roll:'.$thrd.'<br>Name: '.$fname.'<br>Event: '.$lname.'<br>FEES: '.$fee.'<br>----------------<br>'.'</div>';
	
	}}
echo $output;}}
$sql1="UPDATE cyclone SET fees='{$status}' WHERE event='{$_SESSION['event']}' AND roll='{$rolli}'";
   $sql = "SELECT id, Name, Event, roll ,fees, thrd FROM cyclone WHERE event='{$_SESSION['event']}' ";  

$result = $conn->query($sql1);
 mysqli_select_db($conn,'u233978877_fash');
$retval = mysqli_query($conn ,$sql);
   
   if(! $retval ) {
      die('Could not get data: ' . mysql_error());
   }
else{
	while($row = mysqli_fetch_assoc($retval)) {
	echo "<div style='border-color:blue;'><br>--------------------------------<br>".
	"Id :{$row['id']}  <br> ".
		 "UID: {$row['roll']} <br>".
		 "Roll: {$row['thrd']} <br>".
         "Name : {$row['Name']} <br> ".
         "Event : {$row['Event']} <br> ".
		 "FEES : {$row['fees']} <br>" .
		 "<br>--------------------------------<br></div>";
	}

}

$event=$_SESSION['Event'];

if(isset($_SESSION['id'])){ echo '<a href="logout.php" style="color:red">Logout</a>';}?>
<div>
<?php if($_SESSION['event']!="head"){ echo'
<h4>Change Fees Status: </h4>
<form class="w3-card" method="POST" action="logged.php"><br>
<input class="w3-input" type="text" placeholder="Enter UID" name="rollnum"><br>
<select class="w3-input" name="status">
<option value="" disabled selected style="display: none;">Select Status</option>
<option value="Paid">Paid</option>
<option value="Pending">Pending</option>
</select><br>
<input class="w3-input" type="submit" value="Change">

</form>';} 
?>

</div><br><div><br><form method="POST" action="downloadxls.php">
 <input type="submit" name="excel" value="Export Excel Sheet"><br> You must login in a browser<br> to download the excel sheet.<br>type - www.omilap.xyz/loginpage.php <br> in a  browser<br></a></form></div><br>
©2017 - Omkar Bahiwal.<br>
Powered by <a href="http://www.omilap.xyz">omilap.xyz</a>
<br>
<h6>If any technical issue occurs<br> please contact Omkar Bahiwal </h6></body>
</html>

