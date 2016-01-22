<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="adminheader.jsp" %>
		<div class="mdl">
			<div class="mdl1"></div>
			<div class="mdl2"></div>
                        <div class="mdl3">
                            <table  border="1" bordercolor="black" >
			</div>
                        <s:form name="f" method="post" action="item.action" ><font size="5">
		<table  border="0" bordercolor="black">
		
		<tr>
		<td>mid:</td>
		<td><input type="text" name="mid" value=""/> </td>
		</tr>
		
		<tr>
		<td>Item:</td>
		<td><input type="text" name="item" value=""/> </td>
                </tr></br>
	
	
		<tr>
                    <td><input type="submit" name="btninsert" value="insert" ></td>
        
		</tr>	
			
			</font>
						
		
		</table>

          </s:form>
		
			</div>
		</div>

                        </div>
		</div>
        <%@include file="adminfooter.jsp" %>
</body>

</html>

