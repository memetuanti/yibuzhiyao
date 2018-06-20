Ext.define('mark.controller.MarkController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.markController',
	stores : [ 'MarkStore' ],
	models : [ 'MarkModel' ],
	views : [ 'MarkGrid', 'MarkEdit' ],
	init : function() {
		this.control({
			'markGrid' : {
				itemdblclick : this.editMark
			},
			'markEdit button[action=save]' : {
				click : this.updateMark
			}
		});
	},
	editMark : function(grid, record) {
		var view = Ext.widget('markEdit');
		view.down('form').loadRecord(record);
	},
	updateMark : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
