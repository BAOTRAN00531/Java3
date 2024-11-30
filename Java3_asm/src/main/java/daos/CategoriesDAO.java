package daos;

import java.util.List;

import entity.Categories;
import entity.News;

public interface CategoriesDAO {
		/**Truy vấn tất cả*/
		List<Categories> findAll();
		/**Truy vấn theo mã*/
		Categories findById(Categories id);
//		/**Thêm mới*/
		void create(Categories item);
//		/**Cập nhật*/
		void update(Categories item);
//		/**Xóa theo mã*/
		void deleteById(String id);
		
		
//		public static void main(String[] args) {
//		    CategoriesDAO catedao = new CategoriesDAOlmpl();
//		    List<Categories> categories = catedao.findAll();
//		    categories.forEach(c -> System.out.println("Category: " + c.getName()));
//		}

}