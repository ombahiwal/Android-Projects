

<html bgcolor="#ffffcc">
<head><meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<title> Registered candidates</title>
</head><body>
<div style="background:#ffffcc;text-align:center">

<h1><br>MIT<br>Sci-Clone<br>Participants</h1>

<form action="candidates.php" method="POST">
<input type="search" name="search" placeholder="Search for Candidates.">
<input type="submit" placeholder="Search" >
</form>
<?php
   $conn=mysqli_connect("localhost","u233978877_omkar","Omkar109","u233978877_fash");
   if(! $conn ) {
      die('Could not connect: ' . mysql_error());
   }
   //search
   if(isset($_POST['search'])){
	   echo "Search Results : <br>";
	$searchq=$_POST['search'];
	$searchq=preg_replace("#[^0-9a-z]#i","",$searchq);
	   mysqli_select_db($conn,'u233978877_fash');

	$query = mysqli_query($conn,"SELECT * FROM cyclone WHERE roll LIKE '%$searchq%' OR Name LIKE '%$searchq%' OR Event LIKE '%$searchq%'") or die("could not search");
$count = mysqli_num_rows($query);
if($count==0){
	$output = '<br>There are no search results<br>';
}else
{while($row = mysqli_fetch_array($query)){
	$fname= $row['Name'];
	$lname=$row['Event'];
	$id = $row['id'];
	$roll=$row['roll'];
	$output .= '<div class="w3-card" style="background:#ffffcc"> ID: '.$id.'<br>Roll: ' .$roll.'<br>Name: '.$fname.'<br>Event: '.$lname.'<br>----------------<br>'.'</div>';
	echo $output;
	}}
	}
	
	//search
   
   
   $sql = 'SELECT id, Name, Event, roll FROM cyclone';
   mysqli_select_db($conn,'u233978877_fash');
   $retval = mysqli_query($conn ,$sql);
   
   if(! $retval ) {
      die('Could not get data: ' . mysql_error());
   }
   
   while($row = mysqli_fetch_assoc($retval)) {
	echo "--------------------------------<br>".
	"Id :{$row['id']}  <br> ".
		 "Roll: {$row['roll']} <br>".
         "Name : {$row['Name']} <br> ".
         "EVENT : {$row['Event']} <br> ".
         "--------------------------------<br>";
	}
   
   echo "Data Fetched Successfully\n<br>Contact Omkar Bahiwal for Technical Assistance.";
   
   mysqli_close($conn);
?>
<br>
©2017 - Omkar Bahiwal.<br>
Powered by <a href="http://www.omilap.xyz">omilap.xyz</a>
</div></body>
</html>