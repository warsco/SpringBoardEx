package board.command;

import org.springframework.ui.Model;

import board.dao.BoardDao;

public class ListCommand implements BoardCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		BoardDao dao = new BoardDao();
		
	}

}
