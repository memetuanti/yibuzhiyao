Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'group',
	appFolder : server_context + '/resources/js/group/app',
	controllers : [ 'GroupController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'groupGrid'
			} ]
		});
	}
});
