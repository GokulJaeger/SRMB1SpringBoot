<html>
<body>
<h2>Hello World!</h2>
<h1>I am Gokul Jaeger!</h1>
<%= com.org.srm.string.function.StringFunction.concstr("Gokul")%>
<h2>Today:</h2>
<%= com.org.srm.date.function.DateFunction.getCustomDate()%>

<p>JavaScript HTML element:</p>
<p id="idx">Waiting onclick</p>

<button type="button" onclick="myFunction()">Check Date</button>
<script>
function myFunction() { 
	var ts = new Date();
    document.getElementById("idx").innerHTML = ts;
}
</script>
</body>
</html>
