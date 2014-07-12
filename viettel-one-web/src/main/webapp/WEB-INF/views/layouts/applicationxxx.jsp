<%-- 
    Document   : header
    Created on : 13/06/2014, 15:17:32
    Author     : GoodFriend2ks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html>
<html style="height: 100%;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="shortcut icon" href="./images/logo.png">
        <!-- <link rel="stylesheet" href="./styles/themes/gray/easyui.css" type="text/css" media="screen" /> -->
        <link rel="stylesheet" href="./styles/themes/metro-blue/easyui.css" type="text/css" media="screen" />
        
        <link rel="stylesheet" href="./styles/icon.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="./styles/application.css" type="text/css" media="screen" />
        
        <script src="./js/jquery.min.js" type="text/javascript"></script>
        <script src="./js/jquery.easyui.min.js" type="text/javascript"></script>
        <script src="./js/moment.min.js" type="text/javascript"></script>
        <script src="./js/application.js" type="text/javascript"></script>
		
		<script src="./js/store.js" type="text/javascript"></script>
		<script src="./js/oauth2.js" type="text/javascript"></script>
	    <script src="./js/sha256.js" type="text/javascript"></script>
	    <script src="./js/enc-base64-min.js" type="text/javascript"></script>
	    <script src="./js/cookie.js" type="text/javascript"></script>
	    <script src="./js/user.js" type="text/javascript"></script>
	    
        <title>DMS Lite</title>
       	
        <decorator:head />
    </head>

    <body style="height: 95%; margin: 0 0 0 0;">
        <div align="center" style="height: 100%;">

            <div class="easyui-layout" style="height:100%;" >
                <div data-options="region:'north'" style="height:  100px">
                    <div class="easyui-layout" data-options="fit:true">
                        <div data-options="region:'west',split:true,border:false" style="width:200px" align='center'>
                            <img src='./images/logo.png' width="140px">
                        </div>
                        <div data-options="region:'center',border:false" >
                            <div data-options="region:'north',border:false" align='right'>
                                <div >
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-home-page'"></a>
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-email'"></a>
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-cog'"></a>
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-help'"></a>
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true"><b>LOGOUT</b></a>
                                </div>
                            </div>
                             <div data-options="region:'center',border:false">
                                <div style="border-bottom: 1px solid #ddd">
                                  
                                     <a href="#" class="easyui-linkbutton" data-options="plain:true"><b>Current User</b></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div data-options="region:'west',split:true" title="Menu" style="width:200px;">
                    <div class="easyui-accordion" >
                        <div title="Menu Example1">
                            <ul class="easyui-tree" data-options="lines:true">
                                <li>
                                    <span>Item1</span>
                                    <ul>
                                        <li>
                                            <span>SubItem1</span>
                                            <ul>
                                                <li>A link</li>

                                                <li>
                                                    <span>SubItem2</span>
                                                    <ul>
                                                        <li>B Link</li>
                                                        <li>C Link</li>
                                                        <li>D Link</li>

                                                    </ul>
                                                </li>
                                             </ul>
                                        </li>
                                    </ul>
                                </li>

                            </ul>
                        </div>
                        <div title="Menu Exemple2">
                            <ul class="easyui-tree" data-options="lines:true">
                                <li>
                                    <span>Item1</span>
                                    <ul>
                                        <li>
                                            <span>SubItem</span>
                                            <ul>
                                                <li>A link</li>
                                                <li>B link</li>
                                            </ul>
                                        </li>

                                    </ul>

                                </li>
                                <li>
                                    <span>Item2</span>
                                    <ul>
                                        <li>C Link</li>
                                        <li>D Link</li>
                                        <li>E Link</li>

                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div title="CRUD" >
                            <ul class="easyui-tree" data-options="lines:true">
                                <li>
                                    <span>People</span>
                                    <ul>
                                        <li>
                                            <a href="./user">List</a>
                                        </li>

                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div data-options="region:'center'">
                    <decorator:body/> 
                </div>
                <!-- Close Center -->
            </div>
            <!-- Close Layout -->
            <div class="easyui-panel" title="Powered by Corp" style=""></div>
        </div>
    </body>
</html>
