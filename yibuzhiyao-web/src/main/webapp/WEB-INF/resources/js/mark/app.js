Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'mark',
	appFolder : server_context + '/resources/js/mark/app',
	controllers : [ 'MarkController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'markGrid'
			} ]
		});
	}
});
