package persist;
import java.io.Serializable;
import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @author kuang
 *
 */
public class BaseManager extends HibernateDaoSupport {

	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public Session getSession() {
		return super.currentSession();
	}

	public Session loadSession() {
		return super.currentSession();
	}

	/**
	 * 根据id获得持久化对象
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 * @throws PersistenceException
	 */
	public Object getObject(Class<?> clazz, Serializable id) throws Exception {
		Object obj = getHibernateTemplate().get(clazz, id);
		return obj;
	}

	/**
	 * 将生成的实体持久化
	 * 
	 * @param obj
	 * @return
	 */
	public Object saveObject(Object obj) {
		getHibernateTemplate().saveOrUpdate(obj);
		return obj;
	}

	/**
	 * 将生成的实体持久化
	 * 
	 * @param obj
	 * @return
	 */
	public Object saveOrUpdateObject(Object obj) {

		try {
			getHibernateTemplate().saveOrUpdate(obj);
		} catch (Exception e) {
			// 对同一对象进行多次update时易出现主键冲突错误
			getHibernateTemplate().merge(obj);
		}

		return obj;
	}

	/**
	 * 修改对象
	 * 
	 * @param obj
	 * @return
	 */
	public Object updateObject(Object obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	/**
	 * 删除实体
	 * 
	 * @param obj
	 * @return
	 */
	public void deleteObject(Object obj) {

		if (obj != null) {
			getSession().delete(obj);
		}
		getSession().flush();
	}

	public Boolean isSuperAdmin(String account) {
		if (account.equals("admin")) {
			return true;
		}
		return false;
	}
}