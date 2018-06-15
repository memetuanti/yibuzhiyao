Ext.define('group.controller.GroupController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.groupController',
	stores : [ 'GroupStore' ],
	models : [ 'GroupModel' ],
	views : [ 'GroupGrid', 'GroupEdit' ],
	init : function() {
		this.control({
			'groupGrid' : {
				itemdblclick : this.editGroup
			},
			'groupEdit button[action=save]' : {
				click : this.updateGroup
			}
		});
	},
	editGroup : function(grid, record) {
		var view = Ext.widget('groupEdit');
		view.down('form').loadRecord(record);
	},
	updateGroup : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});