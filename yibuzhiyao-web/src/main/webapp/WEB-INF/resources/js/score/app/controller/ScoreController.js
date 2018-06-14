Ext.define('score.controller.ScoreController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.scoreController',
	stores : [ 'ScoreStore' ],
	models : [ 'ScoreModel' ],
	views : [ 'ScoreGrid', 'ScoreEdit' ],
	init : function() {
		this.control({
			'scoreGrid' : {
				itemdblclick : this.editScore
			},
			'scoreEdit button[action=save]' : {
				click : this.updateScore
			}
		});
	},
	editScore : function(grid, record) {
		var view = Ext.widget('scoreEdit');
		view.down('form').loadRecord(record);
	},
	updateScore : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
