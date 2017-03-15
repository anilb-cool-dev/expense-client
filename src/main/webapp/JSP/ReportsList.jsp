<%@ page import="com.concur.expense.ReportsList" %>
<%@ page import="java.util.*" %>


<html>
	<head><title>Reports List</title></head>

    <link rel="stylesheet" href="../javascript/jqwidgets/styles/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="../javascript/jquery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="../javascript/jqwidgets/jqxcore.js"></script>
    <script type="text/javascript" src="../javascript/jqwidgets/jqxdata.js"></script>
    <script type="text/javascript" src="../javascript/jqwidgets/jqxbuttons.js"></script>
    <script type="text/javascript" src="../javascript/jqwidgets/jqxscrollbar.js"></script>
    <script type="text/javascript" src="../javascript/jqwidgets/jqxdatatable.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#dataTable").jqxDataTable(
            {
                altRows: true,
                sortable: true,
                columns: [
                  { text: 'Parameter', dataField: 'Parameter', width: 300 },
                  { text: 'Value', dataField: 'Value', width: 400 }
                ]
            });
        });
    </script>

    <table id="dataTable" border="1">
        <thead>
            <tr>
                <th align="left">Parameter</th>
                <th align="left">Value</th>
            </tr>
        </thead>
        <tbody>

<%
List list = new ReportsList().getReportsList();
String name = new String();
name = "test";
String value = list.get(0).toString();
%>
<tr><td><%= name %></td><td><%= value %></td></tr>

		</tbody>
	</table>
</body>
</html>
