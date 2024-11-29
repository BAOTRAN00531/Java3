package daos;

import java.util.List;

import entity.Newsletters;

public interface NewslettersDAO {
		/**Truy vấn tất cả*/
		List<Newsletters> findAll();
		/**Truy vấn theo mã*/
		Newsletters findById(String id);
		/**Thêm mới*/
		void create(Newsletters item);
		/**Cập nhật*/
		void update(Newsletters item);
		/**Xóa theo mã*/
		void deleteById(String id);
}