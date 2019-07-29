<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>application</title>
<style>
.border
{
padding:px;
border-width:1px;
border-style:solid;
border-color:green;
}
button
{
margin-left:500px;
width:100px;
color:blue;
margin-bottom:4px;
}
button:hover
{
opacity:;
}
.form{
margin-left:100px;
margin-top:10px;
}
.name
{margin-left:100px;
margin-top:10px;
}
.contactdetails
{margin-left:150px;
margin-top:20px;
}
.Applicationheader
{
font-size:40px;
color:green;
}
.eduqual
{
margin-left:100px;
margin-top:40px;
}
.eduqualtwelve
{
margin-left:170px;
margin-top:-30px;
}
.eduqualtenth
{
margin-left:170px;
margin-top:-30px;
}
{
margin-left:170px;
margin-top:-30px;
}
.jobstyle
{
margin-left:100px;
margin-top:5px;

}
.marks
{
margin-left:100px;
margin-top:-40px;

}
.empstatus
{
margin-top:-30px;
margin-left:100px;
}
hr
{
background-color:green;
padding:1px;
}
.imageback
{
height: 100px;
  width: 500px;
}
.id1
{
margin-left:1px;
}
</style>
</head>
<body background="apply.png" >
<div class="Applicationheader">
Application Form
</div>
<div class="form">
<div class="border">
<form action="ApplicationServlet" method="post">
<div class="name">
<h2 style="color:#g86758;font-family:Constantia;">
<div class="id1">
employeeid:<input type="text" name="empaid">
</div>
FirstName:<input type="text" name="fn" required/>	
MiddleName:<input type="text" name="mn"/>	
LastName:<input type="text" name="ln" required/></h2>
</div>
<div class="contactdetails">

<h2 style="color:#g86758;font-family:Constantia;"> 
     Email:<input type="email" name="em" required/> 
     
      PhoneNumber:<input type="text" name="pn" required/></h2>
 
  
</div>
<div class="eduqual">
<h2 style="color:#g86758;font-family:Constantia;">Education Qualification:
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Degree: <select name="degree" id="degree">
        <option selected>-- Select Group --</option><option>B.Com</option><option>B.sc</option>
        <option>B.com Computers</option>
        <option>B.A</option>
        <option>B.E/B.Tech</option>
      </select><br>
      <br></h2>
      </div>
       <div class="marks">
      <h2 style="color:#g86758; font-family:Constantia;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter percentage:<input type="text" name="dmarks" required/>
      </h2>
      </div>
      <div class="eduqualtwelve">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h2 style="color:#g86758;font-family:Constantia;"> 12th Standard: <select name="twelve" id="degree">
        <option selected>-- Select Group --</option>
        <option>Intermediate</option>
        <option>Diploma</option>
        </select><br>
      <br></h2>
      </div>
       <div class="marks">
      <h2 style="color:#g86758;font-family:Constantia;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter percentage:<input type="text" name="tmarks" required/>
      </h2>
      </div>
      
      <div class="eduqualtenth">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h2 style="color:#g86758;font-family:Constantia;"> 10th Standard: <select name="tenthstandard" id="degree">
        <option selected>-- Select Group --</option>
        <option>S.S.C</option>
        <option>C.B.S.E</option>
        </select><br>
      <br></h2>
      </div>
       <div class="marks">
      <h2 style="color:#g86758;font-family:Constantia;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter percentage:<input type="text" name="tenthmarks" required/>
      </h2>
      </div>
      
      <div class="jobstyle">
      
<h2 style="color:#g86758;font-family:Constantia;">Which Position Are you going to Apply?		
<select name="ps">
<option >teir1</option>
<option >teir2</option>
<option >teir3</option>
</select>
</h2>
</div>
<div class="jobstyle">
<h2 style="color:#g86758;font-family:Constantia;">
Avaliable Start Date:<input type="date" name="dt"/>
</h2><br>
</div>
<div class="empstatus">
<h2 style="color:#g86758;font-family:Constantia;">What is Your current Employment Status?</h2><h3>
<input type="radio" name="r1" value="Employed" checked/>Employed
<input type="radio" name="r1" value="Self-Employed"/>Self-Employed
<input type="radio" name="r1" value="Outofproject"/>Outofproject
</h3>
</div>
								<button type="submit" value="Apply For Job">Apply For Job</button>


</form>
</div>
</div>
</body>
</html>