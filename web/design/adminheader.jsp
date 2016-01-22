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
				<li><a href="lp1.html">Home</a></li>
				<li><a href="login.action">Login</a></li>
				<li><a href="#">Update</a>
					<ul>
					<li><a href="#">Lost_item list</a></li>
					<li><a href="#">Found_item list</a></li>
					</ul>
				
				</li>
				<li><a href="#">Add</a>
					<ul>
					<li><a href="category.action">Category</a></li>
					<li><a href="item.action">Item list</a>
                                            
                                        </li>
					</ul>
				
				</li>
				<li><a href="#">Logout</a>
					
				</li>
				
			</ul>
		</div>
</body>
</html>