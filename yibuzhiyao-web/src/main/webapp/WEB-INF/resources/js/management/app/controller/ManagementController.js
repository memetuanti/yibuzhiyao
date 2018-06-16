Ext.define('management.controller.ManagementController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.managementController',
	stores : [ 'ManagementStore' ],
	models : [ 'ManagementModel' ],
	views : [ 'ManagementGrid', 'ManagementEdit' ],
	init : function() {
		this.control({
			'managementGrid' : {
				itemdblclick : this.editManagement
			},
			'managementEdit button[action=save]' : {
				click : this.updateManagement
			}
		});
	},
	editManagement : function(grid, record) {
		var view = Ext.widget('managementEdit');
		view.down('form').loadRecord(record);
	},
	updateManagement : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
