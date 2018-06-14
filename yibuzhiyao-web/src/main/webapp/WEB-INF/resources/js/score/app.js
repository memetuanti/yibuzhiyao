Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'score',
	appFolder : server_context + '/resources/js/score/app',
	controllers : [ 'ScoreController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'scoreGrid'
			} ]
		});
	}
});
