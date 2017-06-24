package repository;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import domain.IEntity;

public class AbstractRepository<E extends IEntity> {

	
	
	@Autowired
	protected SessionFactory sessionFactory;
	private Class<E> entityClass;
	
	
	public AbstractRepository(){
		this.entityClass = (Class<E>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	
	
	public void save(E entity){
		
		Session session = sessionFactory.getCurrentSession();
		session.persist(entity);
		
		
	}
	
	public IEntity getById(long id){
		
		Session session = sessionFactory.getCurrentSession();
		return session.get(entityClass, id);
		
	}
	
	
	public void delete(E entity){
		
		Session session = sessionFactory.getCurrentSession();
		session.delete(entity);
		
	}
	
	public void deleteById(long id){
		
		Session session = sessionFactory.getCurrentSession();
		
		E entity = session.load(entityClass, id);
		session.delete(entity);
		
	}
	
	public void update(E entity){
		
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
		
		
	}
	
	
	
	
}
