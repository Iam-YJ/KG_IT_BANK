<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send1(f) {
		var name=f.name.value;
		var tel = f.tel.value;
		var age = f.age.value;

		//정규식 
		var num_pattern = /^[0-9]{1,3}$/
			//0~9중 숫자 중에 1개에서 3개까지 들어온다는 의미 
		if(!num_pattern.test(age)){ //age가 위의 패턴과 맞으면 true
			alert("나이는 정수로 입력하십시오");
			f.age.focus(); //이거를 치면 age 가서 커서를 깜빡이고 있는다
			return;
			
			}
		if(age == ''){
			alert("나이를 입력하십시오");
			f.age.focus();
			return;
			}
		
		if(name == ''){
			alert("이름을 입력하십시오");
			f.name.focus();
			return;
			}
		
		if(tel == ''){
			alert("전화번호를 입력하십시오");
			f.tel.focus();
			return;
			}

		f.action = "insert1.do";
		f.submit();
		
		
	}

	function send2(f) {
		var name=f.name.value;
		var tel = f.tel.value;
		var age = f.age.value;

		//정규식 
		var num_pattern = /^[0-9]{1,3}$/
			//0~9중 숫자 중에 1개에서 3개까지 들어온다는 의미 
		if(!num_pattern.test(age)){ //age가 위의 패턴과 맞으면 true
			alert("나이는 정수로 입력하십시오");
			f.age.focus(); //이거를 치면 age 가서 커서를 깜빡이고 있는다
			return;
			
			}
		if(age == ''){
			alert("나이를 입력하십시오");
			f.age.focus();
			return;
			}
		
		if(name == ''){
			alert("이름을 입력하십시오");
			f.name.focus();
			return;
			}
		
		if(tel == ''){
			alert("전화번호를 입력하십시오");
			f.tel.focus();
			return;
			}

		f.action = "insert2.do";
		f.submit();
		
		
	}
</script>
</head>
<body>

	<div align="center">
		<form>
			<table border="1">
				<caption>:::개인 정보 입력:::</caption>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>

				</tr>
				<tr>
					<th>나이</th>
					<td><input type="text" name="age"></td>

				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="tel"></td>

				</tr>
				<td colspan="2" align="right">
				<input type="button"value="낱개로 받기" onclick="send1(this.form)">
				 <input type="button" value="객체로 받기" onclick="send2(this.form)">
				</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>