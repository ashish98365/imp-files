package browser;

public class HtmlDesign
{
	public static String getHtmlContent()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><meta charset='utf-8'> <meta name='viewport' content='width=device-width, initial-scale=1'>");
		buffer.append("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css'>");
		buffer.append("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>");
		buffer.append("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js'></script>");
		buffer.append("<style>.test{ color: red; } .none{ display: none; } .panel { position: relative; color: #696c78; background-color: #fff; border: none; box-shadow: 0 1px 2px #c3c3c3; border-radius: 3px; margin-bottom: 20px; } .panel-white, .partition-white { background-color: #fff; color: #616161; } .list-unstyled { padding-left: 0; list-style: none; } ul, ol { margin-top: 0; margin-bottom: 10px; } #vocab-words .boxed { margin-top: 5px; margin-bottom: 15px; text-align: center; } .boxed { border: 1px solid #eee; box-shadow: 0 0 2px #eee; } .boxed .btn { padding: 12px 15px; border-radius: 0; } .btn-green { color: #33691e; background-color: #f1f8e9; border-color: #dcedc8; } .boxed a { font-size: 14px; display: block; margin: -1px; cursor: pointer; } .center { text-align: center; } .text-2x-large { padding: 36px 0; } .text-2x-large { font-size: 36px !important; } .bold-text { font-weight: bold; }</style>");
		buffer.append("<script>function changeWordGroup() { var wordGroupText = $(\"#words option:selected\").text(); var wordGroupValue = $(\"#words\").val(); $(\"#word-group\").html(wordGroupText); $(\"#popup-header\").html(wordGroupText); $(\"[word-group]\").hide(); $(\"[word-group=\"+wordGroupValue+\"]\").show(); } function preparePopup(word, meaning, sentence) { $(\"#popup-word\").html(word.trim()); $(\"#popup-meaning\").html(meaning.trim()); $(\"#popup-sentence\").html(sentence.trim()); } $(document).ready(function(){ changeWordGroup(); });</script>");
		buffer.append("<div class='container'> <div id='vocab-learn' class='panel panel-white' style='zoom: 1;'>");
		buffer.append("<div class='panel-heading'><div class='row'><div class='col-xs-offset-3'></div>");
		buffer.append("<div class='col-xs-6'><label>Word Groups</label> <select class='form-control' id='words' onchange='changeWordGroup()'>");
		buffer.append("<!-- WORD LIST -->");
		buffer.append("</select> </div> <div class='col-xs-offset-3'></div> </div> </div>");
		buffer.append("<div class='panel-body border-top-dark'> <div class='row'> <div class='col-sm-3 col-xs-12'>");
		buffer.append("<h4 class='title'>Notes</h4> <div id='vocab-notes'></div> </div>");
		buffer.append("<div class='col-sm-9 col-xs-12'><h4 class='title'>Words from the group: <span class='text-bold' id='word-group'></span></h4>");
		buffer.append("<ul id='vocab-words' class='list-unstyled row'>");
		buffer.append("<!-- WORD MEANING -->");
		buffer.append("</ul> </div> </div> </div> </div> <div class='modal fade' id='myModal' role='dialog'> <div class='modal-dialog'>");
		buffer.append("<div class='modal-content'> <div class='modal-header'> <button type='button' class='close' data-dismiss='modal'>&times;</button>");
		buffer.append("<h4 class='modal-title'>Group: <span class='text-bold' id='popup-header'></span></h4> </div> <div class='modal-body'> <div class='bootbox-body'>");
		buffer.append("<p class='center'> <span class='text-2x-large' id='popup-word'></span> </p> <p> <span class='bold-text'>Meaning:</span> <span id='popup-meaning'></span>");
		buffer.append("</p> <p> <span class='bold-text'>Example:</span> <span id='popup-sentence'></span> </p> </div> </div>");
		buffer.append("<div class='modal-footer'> <button type='button' class='btn btn-default' data-dismiss='modal'>Close</button> </div> </div> </div> </div> </div> </body> </html>");
		return buffer.toString();
	}
}

