package daos;

import java.util.List;

import entity.News;

public interface NewsDAO {
		/**Truy vấn tất cả*/
		List<News> findAll();
		/**Truy vấn theo mã*/
		News findById(String id);
		/**Thêm mới*/
		void create(News item);
		/**Cập nhật*/
		void update(News item);
		/**Xóa theo mã*/
		void deleteById(String id);
}