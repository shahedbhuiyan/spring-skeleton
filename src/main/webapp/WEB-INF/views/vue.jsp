<%--
  Created by IntelliJ IDEA.
  User: SHAHED
  Date: 1/15/2020
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vue JS</title>
</head>
<body>
<div class="main-container" id = "app">
    <div class="container">
        <dynamic-item inline-template>
            <div>
                <div class="form-group" v-for="item in dynamicItems">
                    <div v-if="item.fieldType == 1">
                        <input type="text" v-model="dynamicField[item.fieldIdentifier]" :placeholder="item.fieldName" :value="item.fieldValue">
                    </div>
                </div>
                <button v-on:click="getData()">Click</button>
            </div>
        </dynamic-item>
        <h1>VUE JS </h1>
    </div>
</div>
</body>
</html>
<script src="${pageContext.request.contextPath}/resources/js/lib/vue.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/lib/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

    Vue.component('dynamic-item',{
        data(){
            return {
                dynamicItems:null,
                dynamicField:{}
            }
        },
        mounted(){
            var self = this;
            $.ajax({
                type:'GET',
                url:'/get/dynamic/field/list',
                success:function(resp){
                    self.dynamicItems = resp;
                }
            });
        },
        methods:{
            getData: function(){
                console.log(this.dynamicField);
                console.log(JSON.stringify(this.dynamicField));
            }
        }
    });

    var app = new Vue({
        el:"#app",
        data(){
            return {

            }
        }
    });
</script>
