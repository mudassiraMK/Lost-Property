<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="homeheader.jsp" %>
<div class="mdl">
    <div class="mdl1"></div>
    <div class="mdl2"></div>
    <div class="mdl3">
                            
        <table  border="1" bordercolor="black" >
    </div>
        <s:form name="f" method="post" action="userinsert" ><font size="5">
            <table  border="0" bordercolor="black">
		
                <tr> <td><s:textfield name="uid" label="Uid:" /> </td></tr>
		<tr><td><s:textfield name="uname" label="Name:"/> </td></tr>
		<tr><td><s:textfield name="email" label="Email:"/> </td> </tr>
		<tr><td><s:select name="city" label="City:" list="{'vadodara','surat','ahmedabad'}"/> </td></tr>
		<tr><td><s:textfield name="birthdate" label="Birthdate" /></td></tr>
		<tr><td><s:radio name="gender" list="{'female','male'}" label="Gender:"/></tr>
		<tr><td><s:password name="password" label="Password:"/></td></tr>
		<tr><td><s:select name="role" label="Role" list="{'Mislayer','Property founder'}" /></td></tr>
                <tr><td><s:textfield name="contactno" label="Contactno"/></td></tr>
		<tr><td><s:submit name="btninsert" value="submit"/></td></tr>	
		</font>
            </table>
        </s:form>
    </div>
</div>
                <%@include file="homefooter.jsp" %>
</body>
</html>
