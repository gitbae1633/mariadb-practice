package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {
	
	public static void main(String[] args) {
		//testInsert();
		testFindAll();
	}

	public static void testInsert() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("돈키호테");
		vo.setPrice(36000);
		vo.setCategoryNo(1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("마음의소리");
		vo.setPrice(30000);
		vo.setCategoryNo(2);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("우당탕탕");
		vo.setPrice(20000);
		vo.setCategoryNo(3);
		dao.insert(vo);

		
	}

	public static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println("제목:"+vo.getTitle()+", 가격:"+vo.getPrice());
		}
	}
}