<html>
<head>
    <link rel="stylesheet" type="txt/css" href="<%=application.getContextPath()%>/design/css/lp.css"/>
	<link rel="stylesheet" type="txt/css" href="<%=application.getContextPath()%>/design/css/menucss.css"/>
	</head>
<body>
		<div class="header">
			<div class="logo">
			<table><tr>
					<td><img src="<%=application.getContextPath()%>/design/images/logo.png" height="125" width="190"></td>
				</tr></table>
			</div>
			<div class="title"  align="CENTER"><b><i><font face="algerian" size="20" color="black" > LOST PROPERTY </font></i></b></div>
		</div>
		<div class="menu">
			<ul id="trans-nav">
				<li><a href="homepage.action">Home</a></li>
				<li><a href="userinsert.action">Registration</a></li>
				
				<li><a href="login.action">Login</a></li>
				<li><a href="#">Search</a>
					<ul>
					<li><a href="#">Search lost</a></li>
					<li><a href="#">Search found</a></li>
					</ul>
				
				</li>
				<li><a href="#">Report</a>
					<ul>
					<li><a href="#">Report lost</a></li>
					<li><a href="#">Report found</a></li>
					</ul>
				
				</li>
				<li><a href="#">About us</a>
					<ul>
					<li><a href="#">Contact us</a></li>
					<li><a href="#">About us</a></li>
					<li><a href="#">User comments</a></li>
				</ul>
				
				</li>
                                <li><a href="adminhome.action">Admin login</a></li>
			</ul>
		</div>
</body>
</html>