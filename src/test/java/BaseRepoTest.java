

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.holo.App;
import com.holo.study.Admin;
import com.holo.study.BaseRepo;
import com.holo.study.SqlUtils;



@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest(classes = App.class)  
public class BaseRepoTest {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	BaseRepo<Admin,Integer> baseRepoAdmin;
	@Test
	public void test20170221()  {
		System.err.println("em==================="+em);
		try {
			//Admin admin=baseRepoAdmin.getFirst("Admin", "id = ?0","id desc", new Object[]{1});
			String jpql = SqlUtils.jpqlFromClazzWhereOrder("Admin", "id = ?0", "id desc");
			System.err.println("jpql================"+jpql);
			Query query = createQueryWithJp(jpql, new Object[]{1});
			//select t from Admin t where id = 1 order by id desc
			
			
			System.err.println("query================"+query);
			query.setFirstResult(0).setMaxResults(1);
			System.err.println("query================"+query.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Query createQueryWithJp(String jpql,Object[] params){
		Query query = em.createQuery(jpql);
		System.err.println("queryEM=============="+query);
		queryAddParam(query, params);
		return query;
	}
	/**
	 * Query加参数
	 * @param query
	 * @param params
	 */
	private void queryAddParam(Query query,Object[] params){
		if(params!=null && params.length > 0){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
	}
}
