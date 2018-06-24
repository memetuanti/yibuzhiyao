Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'main',
	appFolder : server_context + '/resources/js/main/app',
	controllers : [ 'MainController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'mainGrid'
			} ]
		});
	}
});
