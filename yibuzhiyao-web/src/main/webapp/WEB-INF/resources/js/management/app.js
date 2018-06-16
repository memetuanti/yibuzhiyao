Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'management',
	appFolder : server_context + '/resources/js/management/app',
	controllers : [ 'ManagementController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'managementGrid'
			} ]
		});
	}
});
