Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'homework',
	appFolder : server_context + '/resources/js/homework/app',
	controllers : [ 'HomeworkController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'homeworkGrid'
			} ]
		});
	}
});
