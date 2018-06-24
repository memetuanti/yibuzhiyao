Ext.define('main.controller.MainController',{
				extend:'Ext.app.Controller',
				alias:'widget.mainConreoller',
				stores:['MainSrore'],
				models:['MainModel'],
				views:['MainGrid','MainEdit'],
				init:function(){
						this.conreol({
								'mainGrid':{
									itemdblclick:this.editMain
								},
								'mainEdit button[action=save]':{
									click:this.updateMain
								}
						})
				}
});