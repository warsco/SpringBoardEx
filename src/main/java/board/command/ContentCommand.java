package board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class ContentCommand implements BoardCommand{
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String board_num = request.getParameter("board_num");
		
/*		BDao dao = new BDao();
		BDto dto = dto.getContent(bld);
		
		model.addAttribute("content", dto);
*/	
	
	
	}

}
