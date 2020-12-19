/**
 * 
 */

// 미입력 항목 check
function check(){
		theForm = document.input;
		if(theForm.bName.value==""){
			alert("이름을 입력해주세요.");
			return false;
		} else if(theForm.bTitle.value==""){
			alert("제목을 입력해주세요.");
			return false;
		} else{
			alert("입력이 완료되었습니다.");
			return true;
		}
	}