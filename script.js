function changeWordGroup()
{
	var wordGroupText = $("#words option:selected").text();
	var wordGroupValue = $("#words").val();
	$("#word-group").html(wordGroupText);
	$("#popup-header").html(wordGroupText);
	$("[word-group]").hide();
	$("[word-group="+wordGroupValue+"]").show();
}

function preparePopup(word, meaning, sentence)
{
	$("#popup-word").html(word.trim())
	$("#popup-meaning").html(meaning.trim());
	$("#popup-sentence").html(sentence.trim());
}

$(document).ready(function(){
	changeWordGroup();
});

